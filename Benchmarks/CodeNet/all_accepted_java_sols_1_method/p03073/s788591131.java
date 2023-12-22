import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int curr1 = 0, curr2 = 0;
        for (int i = 0; i < N.length(); i++) {
            int c = N.charAt(i) - '0';
            curr1 += c == i % 2 ? 1 : 0;
            curr2 += c == i % 2 ? 0 : 1;
        }
        System.out.println(Math.min(curr1, curr2));
    }
}
