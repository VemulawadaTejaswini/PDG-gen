
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t[] = new int[5];

        for (int i = 0; i < 5; i++) {
            t[i] = scan.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (t[j] < t[j + 1]) {
                    int x = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = x;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(t[i] + " ");
            } else {
                System.out.println(t[i]);
            }
        }
    }
}

