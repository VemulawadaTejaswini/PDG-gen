import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] table = new int[r + 1][c + 1];
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                table[i][j] = sc.nextInt();
                sum += table[i][j];
                System.out.print(String.format("%d ", table[i][j]));
            }
            table[i][c] = sum;
            System.out.println(sum);
        }
        for(int j = 0; j < c; j++){
            int sum = 0;
            for(int i = 0; i < r; i++){
                sum += table[i][j];
            }
            table[r][j] = sum;
            System.out.print(String.format("%d ", sum));
        }
        int sum = 0;
        for(int j = 0; j < c; j++){
            sum += table[r][j];
        }
        System.out.println(sum);
    }
}

