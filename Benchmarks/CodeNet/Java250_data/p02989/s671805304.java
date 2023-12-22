import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = scan.nextInt();
        }
        Arrays.sort(d);
        int half = d.length/2;
        System.out.println(d[half]- d[half-1]);
    }
}