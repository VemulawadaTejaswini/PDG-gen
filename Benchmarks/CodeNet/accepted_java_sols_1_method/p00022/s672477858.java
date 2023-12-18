import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a[] = new int[5000];

        while (n != 0) {
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            int best = -1000000;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += a[j];

                    if (sum > best) {
                        best = sum;

                    }
                }
            }
            System.out.println(best);
            n = scan.nextInt();
        }

    }
}
