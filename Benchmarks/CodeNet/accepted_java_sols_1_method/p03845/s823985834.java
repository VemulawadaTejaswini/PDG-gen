import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] t = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            t[i] = a;
            sum += a;
        }
        int m = Integer.parseInt(sc.next());
        for (int i = 0; i < m; i++) {
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int temp = sum;
            temp += x - t[p - 1];
            System.out.println(temp);
        }
    }
}