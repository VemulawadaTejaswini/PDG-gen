
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        int M = Input.nextInt();
        int A[][] = new int[N][N];
        for (int I = 0; I < M; I++) {
            int X = Input.nextInt();
            int Y = Input.nextInt();
            A[X-1][Y-1]++;
            A[Y-1][X-1]++;           
        }

        for (int R = 0; R < A.length; R++) {
            int Ko=0;
            for (int C = 0; C < A[0].length; C++) {
                Ko+=A[R][C];
            }
            System.out.println(Ko);
        }

    }
}

//Learn Before You Earn
