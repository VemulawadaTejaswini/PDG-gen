import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int N = Integer.parseInt(array[0]);

            String[] Xs = scanner.nextLine().split(" ");
            int[] intArray = new int[N];
            int[] intArray2 = new int[N];
            for (int i = 0; i < N; ++i) {
                int w = Integer.parseInt(Xs[i]);
                intArray[i] = w;
                intArray2[i] = w;
            }
            Xs = null;
            Arrays.sort(intArray2);
            int half = intArray2[N / 2 - 1];
            int halfNext =  intArray2[N / 2];
            for (int i = 0; i < N; ++i) {
                if (intArray[i] <= half) {
                    System.out.println(halfNext);
                } else {
                    System.out.println(half);
                }
            }
        }
    }
}