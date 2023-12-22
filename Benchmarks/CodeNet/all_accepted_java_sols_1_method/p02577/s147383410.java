import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String st = scan.next();
        int ans = 0;
        for (int i = 0; i < st.length(); i++) {
            ans = (ans + st.charAt(i) - '0') % 9;
        }
        System.out.println(ans == 0 ? "Yes" : "No");
    }
}
