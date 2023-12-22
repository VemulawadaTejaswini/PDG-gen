import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        String ans = a.substring(0, 1) + b.substring(0, 1) + c.substring(0, 1);
        System.out.println(ans.toUpperCase());
    }
}