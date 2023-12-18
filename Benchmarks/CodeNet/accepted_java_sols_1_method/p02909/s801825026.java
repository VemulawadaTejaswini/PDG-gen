import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> weather = new HashMap<String, String>();
        weather.put("Sunny", "Cloudy");
        weather.put("Cloudy", "Rainy");
        weather.put("Rainy", "Sunny");
        String a = sc.next();
        System.out.println((String)weather.get(a));
    }
}