import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            int r = scanner.nextInt();
            int g = scanner.nextInt();

            int x = 2 * g - r;

            System.out.println(x);
            scanner.close();
    }



}