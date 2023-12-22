import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String ans = "";
        if (Integer.parseInt(a) > Integer.parseInt(b)) {
            for (int i=0; i<Integer.parseInt(a); i++) {
                ans += b;
            }
        }
        else if (Integer.parseInt(a) < Integer.parseInt(b)) {
            for (int i=0; i<Integer.parseInt(b); i++) {
                ans += a;
            }
        }
        else {
            for (int i=0; i<Integer.parseInt(b); i++) {
                ans += a;
            }
        }
        System.out.println(ans);
    }
}
