import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int T = scanner.nextInt();
        int S = scanner.nextInt();

        System.out.println( S * T >= D ? "Yes" : "No");


    }

}