import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        if (len < 3) {
            System.out.println(s);
        } else {
            System.out.print(s.charAt(0));
            System.out.print(len-2);
            System.out.print(s.charAt(len-1));
        }
    }
}