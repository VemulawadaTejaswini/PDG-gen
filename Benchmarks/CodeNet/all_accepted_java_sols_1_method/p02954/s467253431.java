import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int C[] = new int[N];

        int status = 0;
        int countL = 0;
        int countR = 0;
        int posRL = 0;


        for (int i=0;i<N;i++) {
            if (status == 0) {
                if (S.charAt(i) == 'R') {
                    //Count R
                    status = 0;
                    countR++;
                    C[i] = 0;
                } else { // S.charAt(i) == 'L'
                    // RL!
                    status = 1;
                    posRL = i - 1;
                    C[i-1] = (countR+1)/2;
                    C[i] = 1 + countR/2;
                    countL = 0;
                    countR = 0;
                }
            } else { // status == 1
                if (S.charAt(i) == 'R') {
                    // End
                    status = 0;
                    countR++;
                    C[posRL] += (countL+1)/2;
                    C[posRL+1] += countL/2;
                    C[i] = 0;
                } else { // S.charAt(i) == 'L'
                    // Count L
                    status = 1;
                    countL++;
                    C[i] = 0;
                }
            }
        }

        if (countL > 0) {
            C[posRL] += (countL+1)/2;
            C[posRL+1] += countL/2;
        }

        for (int i=0;i<N;i++) {
            System.out.print(C[i]);
            if (i == N - 1) System.out.println();
            else System.out.print(" ");
        }
    }
}
