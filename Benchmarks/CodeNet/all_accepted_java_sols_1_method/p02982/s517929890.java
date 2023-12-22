import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        int integerNum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                int sum = 0;
                for (int k = 0; k < x[i].length; k++) {
                    sum += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                boolean isInteger = false;
                for (int k = 0; k <= sum; k++) {
                    if (k * k == sum) {
                        isInteger = true;
                    }
                }
                if (isInteger) {
                    integerNum++;
                }
            }
        }
        System.out.println(integerNum);
        sc.close();
    }
}