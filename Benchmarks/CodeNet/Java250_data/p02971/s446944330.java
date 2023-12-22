import java.util.Scanner;

public class Main {
    static int N;
    static double[] a;
    static double first = 0;
    static double second = 0;


    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        a = new double[N];
        for(int i = 0; i < N; i++) {
            double input = scanner.nextDouble();
            a[i] = input;
            if(first < input) {
                second = first;
                first = input;
                continue;
            }
            if(second < input) {
                second = input;
            }
        }
        scanner.close();
    }


    public static void main(String[] args) {
        init();

        for(int i = 0; i < N; i++) {
            if(a[i] == first) {
                System.out.println((int) second);
            } else {
                System.out.println((int) first);
            }
        }
    }
}
