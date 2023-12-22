import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int N = Integer.parseInt(array[0]);

            String[] Xs = scanner.nextLine().split(" ");
            int[] intArray = new int[N];
            int n = 0;
            for (int i = 0; i < N; ++i) {
                int w = Integer.parseInt(Xs[i]);
                intArray[i] = w;
                if (w > n) {
                    n = w;
                }
            }
            int r = 0;
            int minMax = 0;
            for (int i = 0; i < N; ++i) {
                int w = intArray[i];
                int wMin;
                if (n - w > w) {
                    wMin = w;
                } else {
                    wMin = n - w;
                }
                if (wMin > minMax) {
                    minMax = wMin;
                    r = w;
                }
            }
            System.out.println(n + " " + r);
        }
    }
}