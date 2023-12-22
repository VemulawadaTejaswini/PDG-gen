import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        int[] idx = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
            idx[ary[i] - 1] = i;
        }
        for (int a : idx) {
            System.out.print(a + 1 + " ");
        }
    }
}