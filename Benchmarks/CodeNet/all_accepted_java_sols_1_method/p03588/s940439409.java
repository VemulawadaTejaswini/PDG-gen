import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] data = new int[] {0, Integer.MAX_VALUE};
        for (int i  = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b < data[1]) {
                data[0] = a;
                data[1] = b;
            }
        }
        int x = data[0] + data[1];
        System.out.println(x);
    }
}