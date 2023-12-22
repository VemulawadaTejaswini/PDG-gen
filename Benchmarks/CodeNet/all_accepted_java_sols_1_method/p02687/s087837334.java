import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans = "";
        if (s.equals("ABC")) ans = "ARC";
        else ans = "ABC";
        System.out.println(ans);
    }
}
