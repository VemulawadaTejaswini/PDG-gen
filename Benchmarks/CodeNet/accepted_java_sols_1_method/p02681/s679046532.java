import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String ans = "";
        if (s.equals(t.substring(0, s.length()))) {
            ans = "Yes";
        }
        else {
            ans = "No";
        }

        System.out.println(ans);
    }
}
