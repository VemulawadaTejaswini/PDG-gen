import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n < 1) break;
            int[] sum = new int[2];
            for (int i = 0; i < 2; i++) {
                sum[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                String[] s = sc.nextLine().split(" ");
                int[] num = new int[2];
                for (int j = 0; j < 2; j++) {
                    num[j] = Integer.parseInt(s[j]);
                }
                if (num[0] < num[1]) {
                    sum[1] += num[0] + num[1];
                } else if (num[1] < num[0]) {
                    sum[0] += num[0] + num[1];
                } else {
                    sum[0] += num[0];
                    sum[1] += num[1];
                }
            }
            System.out.println(sum[0] + " " + sum[1]);
        }
    }
}