import java.util.Scanner;

public class Main {
    static final String abc = "ABC";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);
            if (a == abc.charAt(0) && b == abc.charAt(1) && c == abc.charAt(2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}