import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            a[i] = (int)(Math.log(x & -x)/Math.log(2));
        }
        System.out.println(Arrays.stream(a).min().getAsInt());
    }
}
