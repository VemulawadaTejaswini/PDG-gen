import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int a = 9;
        int b = 900;
        int c = 90000;
        if (str.length() == 2) {
            System.out.println(a);
        } else if (str.length() == 4) {
            System.out.println(a + b);
        } else if (str.length() == 6) {
            System.out.println(a + b + c);
        } else if (str.length() == 1) {
            System.out.println(str);
        } else if (str.length() == 3) {
            int d = Integer.parseInt(str) - 99;
            System.out.println(a + d);
        } else if (str.length() == 5) {
            int d = Integer.parseInt(str) - 9999;
            System.out.println(a + b + d);
        }
    }
}