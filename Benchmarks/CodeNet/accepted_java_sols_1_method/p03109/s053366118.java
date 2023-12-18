
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S[] = sc.next().split("/");

        int year = Integer.parseInt(S[0]);
        int month = Integer.parseInt(S[1]);

        String ans = "TBD";
        if(year < 2019 || (year == 2019 && month < 5)){
            ans = "Heisei";
        }

        out.println(ans);
    }
}
