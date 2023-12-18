import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i;
        int y;
        int p;
        while (n != 0) {
            int a[] = new int[n];
            int g = 1000000;
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        y = a[i] - a[j];
                        if (y < 0) {
                            y = y * -1;
                        }
                        if (y < g) {
                            g = y;
                        }

                    }
                }
            }

            System.out.println(g);
            n = sc.nextInt();
        }
    }
}

