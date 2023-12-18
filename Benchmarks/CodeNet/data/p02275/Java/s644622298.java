import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {
    public static void main (String[] args) throws Exception {
        Scanner sch = new Scanner(System.in);
        int q = sch.nextInt();
       

        int[] B = countingpaixu(q,sch);
         StringBuilder af = new StringBuilder("");
        af.append(B[0]);
        for (int i = 1; i < B.length; ++i) {
            af.append(" ").append(B[i]);
        
        }
        
        System.out.println(af);
    }

    public static int[] countingpaixu(int n,Scanner aj) {
         int k = 0;
         int[] A = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = aj.nextInt();
            if (A[i] > k) {
                k = A[i];
            }
        }
        int[] P = new int[A.length];
        int i;
        int[] C = new int[k + 1];
        
        for (i = 0; i < A.length; i++) {
            C[A[i]]++;
        }
        for (i = 1; i <= k; ++i) {
            C[i] += C[i - 1];
        }
        for (i = A.length - 1; i >= 0; i--) {
            P[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }
        return P;
    }
}
