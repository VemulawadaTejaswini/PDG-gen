import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        boolean[][] bingo = new boolean[3][3];
//        Arrays.fill(bingo,false);
        int N = sc.nextInt();
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(a[j][k]==b[i]){
                        bingo[j][k] = true;
                    }
                }
            }
        }

        if(bingo[0][0] && bingo[0][1] && bingo[0][2]){
            System.out.println("Yes");
            return;
        }
        if(bingo[1][0] && bingo[1][1] && bingo[1][2]){
            System.out.println("Yes");
            return;
        }
        if(bingo[2][0] && bingo[2][1] && bingo[2][2]){
            System.out.println("Yes");
            return;
        }
        if(bingo[0][0] && bingo[1][0] && bingo[2][0]){
            System.out.println("Yes");
            return;
        }if(bingo[0][1] && bingo[1][1] && bingo[2][1]){
            System.out.println("Yes");
            return;
        }if(bingo[0][2] && bingo[1][2] && bingo[2][2]){
            System.out.println("Yes");
            return;
        }
        if(bingo[0][0] && bingo[1][1] && bingo[2][2]){
            System.out.println("Yes");
            return;
        }
        if(bingo[0][2] && bingo[1][1] && bingo[2][0]){
            System.out.println("Yes");
            return;
        }

        System.out.println("No");


    }
}