import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int sheep = scan.nextInt();
                int wolf = scan.nextInt();

                if (sheep <= wolf) {
                	System.out.println("unsafe");
                } else {
                	System.out.println("safe");
                }

        }

}