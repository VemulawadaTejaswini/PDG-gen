import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextInt();
        double men = r / 2 * r / 2 * 3.141692;
        double shu = r * 3.141592;
        System.out.println(men + " " + shu);

    }
}