import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(sc.next());
        Arrays.sort(a);
        for (int i: a)
            sum += i;
        System.out.print(a[0] + " ");
        System.out.print(a[n-1] + " ");
        System.out.println(sum);
    }
}
