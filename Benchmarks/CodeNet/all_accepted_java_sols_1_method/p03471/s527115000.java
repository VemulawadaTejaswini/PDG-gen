import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        boolean finish = false;
        int[] ans = new int[3];
        for (int i = 0; i * 10000 <= y; i++) {
            int a = i * 10000;
            if (i > n || finish)
                break;
            for (int j = 0; a + (j * 5000) <= y; j++) {
                int b = j * 5000;
                if (i + j > n || finish)
                    break;
                int num = n - i - j;
                if (a + b + (num * 1000) == y) {
                    finish = true;
                    ans[0] = i;
                    ans[1] = j;
                    ans[2] = num;
                    break;
                }
            }
        }
        if (finish) {
            System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
        } else {
            System.out.println("-1 -1 -1");
        }
    }
}