import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int k[];
        k = new int[6];

        for (int i = 0; i < 6; i++) {
            k[i] = scan.nextInt();
        }
        int min = 101;
        int total = 0;
        for (int i = 0; i < 4; i++) {
            if (k[i] < min) {
                min = k[i];
            }
            total += k[i];
            if (i == 3) {
                total = total - min;
            }
        }
        if (k[4] < k[5]) {
            System.out.println(total + k[5]);
        } else {
            System.out.println(total + k[4]);
        }

    }
}

