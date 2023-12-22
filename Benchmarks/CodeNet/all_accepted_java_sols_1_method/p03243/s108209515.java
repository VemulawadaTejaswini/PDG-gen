
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i <= 999; i++) {
            String k = String.valueOf(i);
            if (k.charAt(0) == k.charAt(1) && k.charAt(1) == k.charAt(2)) {
                System.out.println(k);
                break;
            }
        }

    }

}
