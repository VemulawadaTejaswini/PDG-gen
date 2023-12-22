import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.valueOf(scanner.nextLine());
        String[] temp = scanner.nextLine().split(" ");
        int T = Integer.valueOf(temp[0]);
        int A = Integer.valueOf(temp[1]);

        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = scanner.nextInt();
        }

        int result = -1;
        double min = 1000000;

        for (int i = 0; i < H.length; i++) {
            double sa = Math.abs(aveTemp(T, H[i]) - A);
            if (min > sa) {
                min = sa;
                result = i;
            }
        }

        System.out.println(result + 1);
    }

    public static double aveTemp(int T, int x) {
        return (double)T - (double)x * 0.006;
    }

}
