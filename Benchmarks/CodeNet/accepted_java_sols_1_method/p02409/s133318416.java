import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [][][] array = new int[4][3][10];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            array[b-1][c-1][d-1] += e;
        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 10; k++) {
                    System.out.print(" " + array[i][j][k]);
                }
                System.out.println();
            }
            if(i < 3) {
                System.out.println("####################");
            }
        }
    }
}

