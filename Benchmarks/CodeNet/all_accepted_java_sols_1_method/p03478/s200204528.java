import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String val = String.valueOf(i);
            int some = 0;
            for (int j = 0; j < val.length(); j++) {
                some = some + Integer.parseInt(String.valueOf(val.charAt(j)));
            }
            if (a <= some && b >= some) {
                result = result + Integer.valueOf(val);
            }
        }
        System.out.println(result);
    }
}