import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int[] ryou = new int[130];
        for (int i = 0; i < 130; i++) {
            ryou[i] = 0;
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            int f = scanner.nextInt();
            int r = scanner.nextInt();
            int v = scanner.nextInt();
            ryou[(b - 1) * 30 + (f - 1) * 10 + (r - 1)] += v;
        }

        for (int b = 0; b < 4; b++) {
            for (int f = 0; f < 3; f++) {
                for (int r = 0; r < 10; r++) {
                    System.out.print(" " + ryou[b * 30 + f * 10 + r]);
                }
                System.out.println("");
            }
            if (b != 3) {
                System.out.println("####################");
            }
        }


    }

}
