import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int ans = 0;

        for (int i = a; i <= b; i++) {
            StringBuilder work = new StringBuilder(String.valueOf(i));
            if (work.reverse().toString().equals(String.valueOf(i))) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}