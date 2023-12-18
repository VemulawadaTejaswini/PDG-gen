import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt()};
        int d = a[0] / a[1], r = a[0] % a[1];
        double f = (double) a[0] / (double) a[1];
        System.out.printf(d + " " + r + " %f\n", f);
    }
}