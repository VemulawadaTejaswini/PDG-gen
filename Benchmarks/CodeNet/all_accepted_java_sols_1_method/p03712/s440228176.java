
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        int M = Input.nextInt();
        char A[][] = new char[N + 2][M + 2];
        String S[] = new String[N];
        for (int I = 0; I < N; I++) {
            S[I] = Input.next();
        }
try{
        for (int R = 0; R < A.length; R++) {
            for (int C = 0; C < A[0].length; C++) {
                if ((R >= 1 && C >= 1) && (R < N + 1 && C < M + 1)) {
                    A[R][C] = S[R - 1].charAt(C - 1);
                } else {
                A[R][C]='#';}
                System.out.print(A[R][C]);
            }
            System.out.println("");
        }
}catch(Exception e){}
    }
}

//Learn Before You Earn
