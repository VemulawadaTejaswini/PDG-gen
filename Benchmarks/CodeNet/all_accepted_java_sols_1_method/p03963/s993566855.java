import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        long a = (long) (k * Math.pow((double) k - 1, (double) n - 1));
        System.out.println(a);
    }
}
