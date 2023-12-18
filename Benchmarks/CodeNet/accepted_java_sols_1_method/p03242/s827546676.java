import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String ans = "";

        if (n.charAt(0) == '1') {
            ans += "9";
        } else {
            ans += "1";
        }

        if (n.charAt(1) == '1') {
            ans += "9";
        } else {
            ans += "1";
        }

        if (n.charAt(2) == '1') {
            ans += "9";
        } else {
            ans += "1";
        }

        System.out.println(ans);
    }
}