import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        if (s.length() != a + b + 1) {
            System.out.println("No");
            return;
        }
        if (!"-".equals(String.valueOf(s.charAt(a)))) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == a) {
                continue;
            }
            int num = Character.getNumericValue(s.charAt(i));
            if (!(num >= 0 && num < 10)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
