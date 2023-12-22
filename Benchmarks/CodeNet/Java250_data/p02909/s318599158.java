import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] weather = {"Sunny", "Cloudy", "Rainy"};
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        TommorowWeather(0, weather, S);
    }
    public static void TommorowWeather(int index, String[] weather, String S) {
        if (index >= 3) {
            return;
        }
        if (S.equals(weather[index])) {
            int ans = index + 1;
            if (ans >= 3) {
                ans = 0;
            }
            System.out.println(weather[ans]);
            return;
        }
        TommorowWeather(index + 1, weather, S);
    }
}
