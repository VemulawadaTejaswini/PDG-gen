import java.util.Scanner;

public class Main{
    public static void Initialize(int[][] A){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                A[i][j] = 0;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A1;
        A1 = new int[3][10];
        int[][] A2;
        A2 = new int[3][10];
        int[][] A3;
        A3 = new int[3][10];
        int[][] A4;
        A4 = new int[3][10];
        Initialize(A1);
        Initialize(A2);
        Initialize(A3);
        Initialize(A4);
        int[] b = new int[n];
        int[] f = new int[n];
        int[] r = new int[n];
        int[] v = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
            f[i] = sc.nextInt();
            r[i] = sc.nextInt();
            v[i] = sc.nextInt();
            if(f[i] == 3){
                f[i] = 0;
            }
            for(int k = 0; k < 3; k++){
                for(int l = 0; l < 10; l++){
                    if(b[i] == 1 && (f[i] == (k + 1) % 3) && (r[i] == l + 1)){
                        A1[k][l] = A1[k][l] + v[i];
                    }
                }
            }
            for(int k = 0; k < 3; k++){
                for(int l = 0; l < 10; l++){
                    if(b[i] == 2 && (f[i] == (k + 1) % 3) && (r[i] == l + 1)){
                        A2[k][l] = A2[k][l] + v[i];
                    }
                }
            }
            for(int k = 0; k < 3; k++){
                for(int l = 0; l < 10; l++){
                    if(b[i] == 3 && (f[i] == (k + 1) % 3) && (r[i] == l + 1)){
                        A3[k][l] = A3[k][l] + v[i];
                    }
                }
            }
            for(int k = 0; k < 3; k++){
                for(int l = 0; l < 10; l++){
                    if(b[i] == 4 && (f[i] == (k + 1) % 3) && (r[i] == l + 1)){
                        A4[k][l] = A4[k][l] + v[i];
                    }
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(" " + A1[i][j]);
            }
            System.out.println();
        }
        for(int j = 0; j < 20; j++){
            System.out.print("#");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(" " + A2[i][j]);
            }
            System.out.println();
        }
        for(int j = 0; j < 20; j++){
            System.out.print("#");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(" " + A3[i][j]);
            }
            System.out.println();
        }
        for(int j = 0; j < 20; j++){
            System.out.print("#");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(" " + A4[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
