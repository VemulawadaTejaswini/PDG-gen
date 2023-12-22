import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(new BufferedInputStream(System.in));

    public static void main(String[] args) {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.length() + 1 == s2.length() && s1.equals(s2.substring(0, s1.length()))) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}