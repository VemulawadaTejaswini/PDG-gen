
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tosi[] = new int[n];
        int M[] = new int[n];
        int D[] = new int[n];
        int i;

        int k;
        int c = 0;

        for (k = 0; k < n; k++) {
            int total = 0;
            int day = 0;
            tosi[k] = sc.nextInt();
            M[k] = sc.nextInt();
            D[k] = sc.nextInt();

            for (i = tosi[k] + 1; i <= 1000; i++) {
                if (i % 3 == 0) {
                    total += 200;
                } else {
                    total += 195;
                }
            }
            if (tosi[k] % 3 == 0) {
                int tuki = (M[k] - 1) * 20;
                day = tuki + D[k] - 6;
                System.out.print(day);

            } else {
                if ((M[k] - 1) % 2 == 0) {
                    day = ((M[k] - 1) / 2) * 20 + ((M[k] - 1) / 2) * 19 + D[k] - 1;
                    System.out.print(day);
                } else {
                    day = ((M[k]) / 2) * 20 + ((M[k] - 1) / 2) * 19 + D[k] - 1;
                    System.out.print(day);
                }

            }

            total = total - day;
            System.out.println(" " + total);
        }

    }

}

