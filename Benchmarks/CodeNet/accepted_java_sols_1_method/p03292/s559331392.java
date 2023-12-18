import java.util.Arrays;
import java.util.Scanner;

//A - Task Scheduling Problem
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res = 0;
        for (int i = 1; i < a.length; i++) res += (a[i] - a[i - 1]);
        System.out.println(res);
    }
}
