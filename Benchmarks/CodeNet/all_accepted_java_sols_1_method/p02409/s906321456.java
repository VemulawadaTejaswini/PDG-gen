import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][10];
        int[][] B = new int[3][10];
        int[][] C = new int[3][10];
        int[][] D = new int[3][10];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++)
                A[i][j] = B[i][j] = C[i][j] = D[i][j] = 0;
        }

        int time = sc.nextInt();

        for(int i = 0; i < time; i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();

            if(b == 1)
                A[f - 1][r - 1] += v;
            if(b == 2)
                B[f - 1][r - 1] += v;
            if(b == 3)
                C[f - 1][r - 1] += v;
            if(b == 4)
                D[f - 1][r - 1] += v;
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++)
                System.out.print(" " + A[i][j]);
            System.out.println("");
        }
        System.out.println("####################");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++)
                System.out.print(" " + B[i][j]);
            System.out.println("");
        }
        System.out.println("####################");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++)
                System.out.print(" " + C[i][j]);
            System.out.println("");
        }
        System.out.println("####################");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++)
                System.out.print(" " + D[i][j]);
            System.out.println("");
        }
        
        sc.close();
    }
}

