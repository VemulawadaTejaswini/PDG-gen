import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String A = "";
        String B = "";
        for (int i = 0; i < Integer.parseInt(b); i++) {
            A += a;
        }
        for (int i = 0; i < Integer.parseInt(a); i++) {
            B += b;
        }
        System.out.print((A.compareTo(B)) < 0 ? A : B);
    }
}