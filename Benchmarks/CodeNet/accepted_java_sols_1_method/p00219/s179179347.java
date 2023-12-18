
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n != 0) {
            int c[] = new int[10];
            int i = 0;
            int g = 0;
            for (i = 0; i < 10; i++) {
                int ice = i;
                c[ice] = 0;
            }
            for (g = 0; g < n; g++) {
                int ice = scan.nextInt();
                c[ice] += 1;
            }
            for (int f = 0; f < 10; f++) {
                if (c[f] == 0) {
                    System.out.println("-");
                } else {
                    for (int b = 0; b < c[f]; b++) {
                        System.out.print("*");

                    }
                    System.out.println("");
                }

            }
            n = scan.nextInt();
        }

    }

}

