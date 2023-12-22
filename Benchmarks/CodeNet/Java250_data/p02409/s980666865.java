import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tow1 = new int[3][10];
        int[][] tow2 = new int[3][10];
        int[][] tow3 = new int[3][10];
        int[][] tow4 = new int[3][10];
        int b = 0, f = 0, r = 0, v = 0;
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            b = sc.nextInt();
            f = sc.nextInt()-1;
            r = sc.nextInt()-1;
            v = sc.nextInt();
            if (b == 1) {
                tow1[f][r] += v;
            } else if (b == 2) {
                tow2[f][r] += v;
            } else if (b == 3) {
                tow3[f][r] += v;
            } else if (b == 4) {
                tow4[f][r] += v;
            }
            
    }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %d", tow1[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %d", tow2[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %d", tow3[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %d", tow4[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
