
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s[] = new int[10];
        int g[] = new int[5];

        while (true) {
            int k;
            int goal = 0;
            int A = 0;

            s[0] = scan.nextInt();
            s[1] = scan.nextInt();
            if (s[0] + s[1] == 0) {
                break;
            }

            for (int i = 2; i < 10; i++) {
                s[i] = scan.nextInt();
            }

            for (k = 0; k < 5; k++) {
                g[k] = s[2 * k] + s[2 * k + 1];
                if (k > 0) {
                    if (g[k] > A) {
                        A = g[k];
                        goal = k;
                    }
                }
                if (k == 0) {
                    A = g[k];
                }
             
            }
            
            switch (goal) {
                case 0:
                    System.out.println("A " + g[0]);
                    break;
                case 1:
                    System.out.println("B "+ g[1]);
                    break;
                case 2:
                    System.out.println("C " + g[2]);
                    break;
                case 3:
                    System.out.println("D " + g[3]);
                    break;
                case 4:
                    System.out.println("E " + g[4]);
                    break;
            }
        }
    }

}

