import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int max = -100000, min = 1000000, sum = 0;

        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
            }

            Arrays.sort(a);
            if(a[0] < min) min = a[0];
            if(a[a.length - 1] > max) max = a[a.length - 1];

            System.out.println(min + " " + max + " " + sum);
        }
}