import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int num = Integer.valueOf(a + b);

        int ans = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                ans = i;
            }
        }

        System.out.println((ans * ans == num)? "Yes": "No");
    }
}