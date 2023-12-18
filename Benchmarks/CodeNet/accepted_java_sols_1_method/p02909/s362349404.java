import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (str.equals("Cloudy")) {
            System.out.println("Rainy");
        } else if (str.equals("Rainy")) {
            System.out.println("Sunny");
        }
    }
}
