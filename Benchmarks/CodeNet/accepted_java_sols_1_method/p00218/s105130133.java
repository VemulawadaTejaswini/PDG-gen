
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                int math = scan.nextInt();
                int English = scan.nextInt();
                int japan = scan.nextInt();

                if (math == 100 || English == 100 || japan == 100) {
                    System.out.println("A");

                } else if ((math + English) / 2 >= 90) {
                    System.out.println("A");

                } else if ((math + English + japan) / 3 >= 80) {
                    System.out.println("A");

                } else if ((math + English + japan) / 3 >= 70) {
                    System.out.println("B");

                } else if ((math + English + japan) / 3 >= 50 && math >= 80 || English >= 80) {
                    System.out.println("B");

                } else {
                    System.out.println("C");
                }
            }
            n = scan.nextInt();
        }

    }
}

