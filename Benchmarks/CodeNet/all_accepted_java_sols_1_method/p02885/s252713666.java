import java.util.Scanner;

public class Main {
    private static final String SUNNY = "Sunny";
    private static final String CLOUDY = "Cloudy";
    private static final String RAINY = "Rainy";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > B * 2) {
            System.out.println(A - B * 2);
        } else {
            System.out.println(0);
        }
    }
}