import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        String y = sc.next();

        int ans = 0;

        for (int i = 0; i < x.length(); i++) {
            if  (x.charAt(i) == y.charAt(i)) {

            } else {
                ans++;
            }
        }


        System.out.println(ans);

        sc.close();

    }

}
