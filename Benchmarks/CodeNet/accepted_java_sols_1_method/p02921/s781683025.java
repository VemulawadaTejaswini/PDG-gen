import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String forecast = s.next();
        String actual = s.next();

        int result = 0;
        for (int i = 0; i < 3; i++) {
            if (forecast.charAt(i) == actual.charAt(i)) result += 1;
        }
        System.out.println(result);
    }


}