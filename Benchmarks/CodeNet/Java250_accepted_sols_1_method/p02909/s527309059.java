import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        String wet = in.next();
        Map<String, String> wetmap = new HashMap<>();
        wetmap.put("Sunny", "Cloudy");
        wetmap.put("Cloudy", "Rainy");
        wetmap.put("Rainy", "Sunny");
        System.out.println(wetmap.get(wet));

    }
}
