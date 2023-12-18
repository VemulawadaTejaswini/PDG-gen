
import java.util.Scanner;

public class Main {
    private static final String SUNNY = "Sunny";
    private static final String CLOUDY = "Cloudy";
    private static final String RAINY = "Rainy";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        switch (S) {
            case SUNNY:
                System.out.println(CLOUDY);
                return;
            case CLOUDY:
                System.out.println(RAINY);
                return;
            case RAINY:
                System.out.println(SUNNY);
                return;
        }
    }
}