import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    static int cnt = 0;
    static ArrayList<String> op = new ArrayList<>();
    static final int A = 0;
    static final int B = 1;
    static final int C = 2;
    static final int Zero = 3;
    static final int One = 4;
    static final int X = 5;
    static final int Y = 6;
    static final int S = 7;
    static int ptr = 8;
    static final int[] B_Bits = malloc(ptr, ptr += 31);

    public static void main(String[] args) throws Exception {
        // System.out.println(ptr);
        // System.setOut(new PrintStream(new File("out")));
        // Ignore the special case: A = B = 0, because (0 < 0) = 0 and (0 + 0) = 0.

        PrepareZeroAndOne: {
            ad(A, B, S);                      // tmp <= A + B
            lt(Zero, S, One);                 // 1   <= (0 < A + B)
        }

        BtoBits: { // y = 0 => 2^(b_0) => 2^(b_0) + 2^(b_1) => ... => B (b_0 > b_1 > ...).
            for (int i = 30; i >= 0; i--) {
                setOne(S);
                shiftLeft(S, i);
                ad(Y, S, S);                  // tmp  <= y + 2^i
                lt(B, S, S);                  // tmp  <= B < tmp  (i.e. B <  y + 2^i)
                lt(S, One, S);                // tmp  <= !tmp     (i.e. B >= y + 2^i)
                ad(B_Bits[i], S, B_Bits[i]);  // b[i] <= tmp
                shiftLeft(S, i);              // tmp  <= tmp << i (i.e. if B >= y + 2^i then 2^i else 0)
                ad(Y, S, Y);                  // y    <= y + tmp
            }
        }
        

        Multiply: {
            for (int i = 30; i >= 0; i--) {
                setOne(S);
                shiftLeft(S, i);
                ad(X, S, S);                             // tmp  <= x + 2^i
                lt(A, S, S);                             // tmp  <= A < tmp  (i.e. A <  x + 2^i)
                lt(S, One, S);                           // tmp  <= !tmp     (i.e. A >= x + 2^i)
                ad(Zero, S, Y);                          // y    <= tmp
                shiftLeft(S, i);                         // tmp  <= tmp << i (i.e. if A >= x + 2^i then 2^i else 0)
                ad(X, S, X);                             // x    <= x + tmp
                for (int j = 0; j < 31; j++) {
                    and(Y, B_Bits[j], S);                // tmp    <= A[i] * B[j]
                    shiftLeft(S, i + j);                 // S[i+j] <= S[i+j] + tmp
                    ad(C, S, C);
                }
            }
        }

        System.out.println(cnt);
        op.forEach(System.out::println);
    }

    static int[] malloc(int from, int to) {
        int[] mem = new int[to - from];
        Arrays.setAll(mem, i -> from + i);
        return mem;
    }

    static void lt(int i, int j, int dst) {
        cnt++;
        op.add(String.format("< %d %d %d", i, j, dst));
    }

    static void ad(int i, int j, int dst) {
        cnt++;
        op.add(String.format("+ %d %d %d", i, j, dst));
    }

    static void setOne(int i) {
        lt(Zero, One, i);
    }

    static void clear(int i) {
        lt(i, i, i);
    }

    static void shiftLeft(int i, int shamt) {
        for (int k = 0; k < shamt; k++) {
            ad(i, i, i);
        }
    }

    static void and(int i, int j, int dst) {
        ad(i, j, dst);
        lt(One, dst, dst);
    }
}
