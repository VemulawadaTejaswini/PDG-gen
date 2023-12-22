import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        sc.close();
        int ans = WeatherMatch(S, T);

        System.out.println(ans);
    }
    public static int WeatherMatch(String S, String T) {
        if (S.length() == 0) {
            return 0;
        }
        if (S.charAt(0) == T.charAt(0)) {
            return 1 + WeatherMatch(S.substring(1), T.substring(1));
        }
        return WeatherMatch(S.substring(1), T.substring(1));
    }
}
