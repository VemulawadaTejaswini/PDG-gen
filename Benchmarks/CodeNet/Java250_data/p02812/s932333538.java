import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        char A = 'A';
        char B = 'B';
        char C = 'C';
        int N = sc.nextInt();
        String S = sc.next();

        char[] s = S.toCharArray();

        for(int i = 0; i < N-2; i++) {
            if (s[i] == A) {
                if (s[i+1] == B) {
                    if (s[i+2] == C) {
                        X++;
                    }
                }
            }
        }
        System.out.println(X);
    }
}