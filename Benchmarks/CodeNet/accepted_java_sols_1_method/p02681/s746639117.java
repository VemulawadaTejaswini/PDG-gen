import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int n = s.length();

        System.out.println(s.substring(0, n).equals(t.substring(0, n)) ? "Yes" : "No");
        sc.close();
    }
}