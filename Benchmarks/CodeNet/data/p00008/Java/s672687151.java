import java.util.Scanner;

public class p1 {

    public static void main(String args[]) {
        int n, ans;

        Scanner reader = new Scanner(System.in);
        while (true) {
            n = reader.nextInt();
            ans = 0;
            for(int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    for (int c = 0; c < 10; c++) {
                        for (int d = 0; d < 10; d++) {
                            if (a + b + c + d == n) {
                                ans++;
                            }
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}