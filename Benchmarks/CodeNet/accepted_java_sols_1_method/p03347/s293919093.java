import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];

        for (int i = 0; i < N; ++i) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        long count = 0;
        int prep = 0;

        for (int i = N - 1; i >= 0; --i) {
            int current = array[i];
            if (current >= prep) {
                count += current;
            } else if (current < prep - 1) {
                break;
            }
            prep = current;
        }
        if (prep > 0) {
            count = -1;
        }
        System.out.println(count);
    }
}