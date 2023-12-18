import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int ans = 0;
        int work = 0;

        for (int i = 1; i <= x; i++) {
            for (int j = 2; j < 10; j++) {
                work = (int) Math.pow(i, j);
                if (work <= x) {
                    ans = Math.max(ans, work);
                } else {
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}