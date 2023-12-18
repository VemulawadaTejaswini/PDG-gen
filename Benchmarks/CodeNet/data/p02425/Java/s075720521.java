import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        BitSet bs = new BitSet(64);

        long q = sc.nextLong();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            switch (type) {
                case 0:
                    if (bs.get(sc.nextInt())) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 1:
                    bs.set(sc.nextInt());
                    break;
                case 2:
                    bs.clear(sc.nextInt());
                    break;
                case 3:
                    bs.flip(sc.nextInt());
                    break;
                case 4:
                    if (bs.cardinality() == 64) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 5:
                    if (!bs.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 6:
                    if (bs.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 7:
                    sb.append(bs.cardinality()).append("\n");
                    break;
                case 8:
                    sb.append(toBitInteger(bs)).append("\n");
                    break;
                default:
                    return;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.print(sb);
        out.flush();
        
        sc.close();
    }

    public static BigInteger toBitInteger(BitSet bs) {
        BigInteger rst = BigInteger.ZERO;
        BigInteger weight = BigInteger.ONE;
        BigInteger two = BigInteger.valueOf(2);
        for (int i = 0; i < 64; i++) {
            if (bs.get(i)) rst = rst.add(weight);
            weight = weight.multiply(two);
        }
        return rst;
    }
}

