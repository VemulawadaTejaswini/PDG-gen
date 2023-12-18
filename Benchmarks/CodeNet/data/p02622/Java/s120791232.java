
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int c = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != a.charAt(i)) {
                c++;
            }
        }
        System.out.println(c);
    }
}
