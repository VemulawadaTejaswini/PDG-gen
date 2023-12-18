
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i != 4; i++) {
            int t = scan.nextInt();
            int n = scan.nextInt();
            switch (t) {
                case 1:
                    System.out.println(n * 6000);
                    break;
                case 2:
                    System.out.println(n * 4000);
                    break;
                case 3:
                    System.out.println(n * 3000);
                    break;
                case 4:
                    System.out.println(n * 2000);
                    break;

            }

        }
    }
}

