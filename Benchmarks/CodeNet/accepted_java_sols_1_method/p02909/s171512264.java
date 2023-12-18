import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(FORECAST.get(scan.nextLine()));
        scan.close();
    }

    private static final Map<String, String> FORECAST = Collections
            .unmodifiableMap(new LinkedHashMap<String, String>() {
                private static final long serialVersionUID = 8811606967577385220L;
                {
                    put("Sunny", "Cloudy");
                    put("Cloudy", "Rainy");
                    put("Rainy", "Sunny");
                }
            });
}