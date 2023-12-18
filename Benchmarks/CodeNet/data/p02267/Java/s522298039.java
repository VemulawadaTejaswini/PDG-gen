import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] S = new int[n];
        while (n != 0) {
            S[n - 1] = in.nextInt();
            n--;
        }
        
        int q = in.nextInt();
        int[] T = new int[q];
        while (q != 0) {
            T[q - 1] = in.nextInt();
            q--;
        }
        
        System.out.println(include(S, T));
    }
    
    static int include(int[] S, int[] T) {
        int count = 0;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < S.length; j++) {
                if (T[i] == S[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}