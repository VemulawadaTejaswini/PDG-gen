import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(str.length() == 1) {
            System.out.println(str);
            return;
        }
        long num = Long.parseLong(str.substring(1));
        int ans = Integer.parseInt(str.substring(0, 1)) + 9 * (str.length() - 1);
        if(num < Math.pow(10, str.length() - 1) - 1) {
            ans--;
        }
        System.out.println(ans);
    }
}