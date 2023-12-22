import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<String, String> map = new HashMap<>();
    static {
        map.put("Sunny", "Cloudy");
        map.put("Cloudy", "Rainy");
        map.put("Rainy", "Sunny");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        System.out.println(map.get(N));
    }
}
