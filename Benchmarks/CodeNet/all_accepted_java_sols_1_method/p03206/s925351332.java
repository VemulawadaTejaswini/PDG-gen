import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int D = scanner.nextInt();

        switch (D) {
            case 25:
                System.out.println("Christmas");
                return;
            case 24:
                System.out.println("Christmas Eve");
                return;
            case 23:
                System.out.println("Christmas Eve Eve");
                return;
            case 22:
                System.out.println("Christmas Eve Eve Eve");
                return;
        }


    }

}
