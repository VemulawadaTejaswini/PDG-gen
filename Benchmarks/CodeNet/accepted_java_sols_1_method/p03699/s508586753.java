
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();

        Integer A[] = new Integer[N];
        int Sum = 0;
        for (int I = 0; I < N; I++) {
            A[I] = Input.nextInt();
            Sum += A[I];
        }
        Arrays.sort(A);
        if (Sum % 10 == 0) {
            for (int I = 0; I < A.length; I++) {
                if ((Sum - A[I]) % 10 != 0) {
                    Sum = Sum - A[I];
                    System.out.println(Sum);
                    break;
                }
                if (I == N - 1) {
                    System.out.println("0");

                }
            }
        } else {
            System.out.println(Sum);
        }
    }
}

//WWW.IJustAnsweredWrong.COM

//Kappa
