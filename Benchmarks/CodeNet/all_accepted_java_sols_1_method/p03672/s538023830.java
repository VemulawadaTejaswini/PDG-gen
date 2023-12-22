import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int l = s.length();
        if (l % 2 == 0) {
            s = s.substring(0, s.length() - 2);
        } else {
            s = s.substring(0, s.length() - 1);
        }
        while (s.length() > 0) {
            int half = s.length() / 2;
            String str1 = s.substring(0, half);
            String str2 = s.substring(half, s.length());
            if (str1.equals(str2)) {
                System.out.println(str1.length() * 2);
                return ;
            }

            s = s.substring(0, s.length() - 2);
        }

        System.out.println(0);
    }

}