import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] ary = new int[n][2];
        for (int i = 0; i < n; i++) {
            ary[i][0] = Integer.parseInt(sc.next());
            ary[i][1] = Integer.parseInt(sc.next());
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += Math.sqrt(Math.pow(ary[i][0] - ary[j][0], 2) + Math.pow(ary[i][1] - ary[j][1], 2));
            }
        }
        System.out.println(2 * sum / n);
    }
}