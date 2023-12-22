import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);

        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            a += Integer.parseInt(s.substring(i, i+1));
        }

        if (n % a == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
