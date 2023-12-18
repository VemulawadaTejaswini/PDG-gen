import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if ("0".equals(n)) {
            System.out.println("Yes");
        } else {
            long sum = 0;
            for (int i = 0; i < n.length(); i++) {
                sum += Integer.parseInt(n.substring(i, i + 1));
            }
            System.out.println((sum % 9 == 0) ? "Yes" : "No");
        }

    }
}
