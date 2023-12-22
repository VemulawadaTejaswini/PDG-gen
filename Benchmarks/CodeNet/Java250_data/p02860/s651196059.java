import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (n % 2 == 1) {
            System.out.println("No");
            return;
        }
        char[] t = s.toCharArray();
        for (int i = 0 ; i < n / 2 ; i++) {
            if (t[i] != t[i + n/2]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}