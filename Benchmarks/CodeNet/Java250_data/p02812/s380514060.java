
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String x = in.next();

        int cnt = 0;

        for (int i = 0; i < n - 2; i++) {

            StringBuilder ans = new StringBuilder();
            ans.append(x.charAt(i));
            ans.append(x.charAt(i+1));
            ans.append(x.charAt(i+2));

            if (ans.toString().equals("ABC")) {
                cnt++;
            }

        }


        System.out.println(cnt);

    }

}
