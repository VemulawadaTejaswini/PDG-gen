import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x = 0;
        String ans = "Yes";

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        x = Double.parseDouble((a + b));

        if (Math.sqrt(x) % 1 != 0) {
            ans = "No";
        }
        System.out.println(ans);
    }
}
