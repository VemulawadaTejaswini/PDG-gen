import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int g = scan.nextInt();

        int ecart = g - r;

        System.out.println(g + ecart);
    }
}
