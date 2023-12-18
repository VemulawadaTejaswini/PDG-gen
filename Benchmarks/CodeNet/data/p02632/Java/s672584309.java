import java.util.*;

public class Program {

    public static final int M = 1000000007;

    public static int[][] dfa;
    public static long[][] paths;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        kmp(s); // generate dfa

        paths = new long[s.length() + 1][s.length() + 1];
        for (int k = 0; k < 26; k++)
            for (int i = 0; i < dfa[0].length; i++)
                paths[i][dfa[k][i]]++;            
        paths[paths.length - 1][paths.length - 1] = 26;

        paths = matrixToPower(paths, n);

        System.out.println(paths[0][s.length()]);
    }

    public static long[][] matrixToPower(long[][] a, int p) {
        long[][] b = a;
        for (int n = 1; n < p; n++)
            a = matrixMultiplication(a, b);
        return a;
    }

    public static long[][] matrixMultiplication(long[][] m1, long[][] m2) {
        int len = m1.length;
        long[][] mResult = new long[len][len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                for(int k = 0; k < len; k++) {
                    mResult[i][j] += (m1[i][k] * m2[k][j]) % M;
                    mResult[i][j] %= M;
                }
            }
        }
        return mResult;
    }

    // create the DFA from a String
    public static void kmp(String pat) {
        // build DFA from pattern
        int m = pat.length();
        dfa = new int[26][m]; 
        dfa[pat.charAt(0) - 'A'][0] = 1; 
        for (int X = 0, j = 1; j < m; j++) {
            for (int c = 0; c < 26; c++) 
                dfa[c][j] = dfa[c][X];         // Copy mismatch cases. 
            dfa[pat.charAt(j) - 'A'][j] = j+1; // Set match case. 
            X = dfa[pat.charAt(j) - 'A'][X];   // Update restart state. 
        } 
    }

}