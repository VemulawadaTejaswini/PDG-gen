import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (!(s = scanner.next()).equals("0")) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int d = (c - '0');
                sum += d;
            }
            System.out.println(sum);
        }
    }
}
