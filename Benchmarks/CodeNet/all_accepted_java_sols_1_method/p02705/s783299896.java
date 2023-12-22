import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                double R = scan.nextDouble();
                scan.close();

                System.out.println(2 * R * Math.PI);
        }

}