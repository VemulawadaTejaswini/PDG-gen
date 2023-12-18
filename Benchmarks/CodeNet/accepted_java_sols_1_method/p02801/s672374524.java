import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c = s.charAt(0);
        c++;
        System.out.println(Character.toChars(c));
    }
}
