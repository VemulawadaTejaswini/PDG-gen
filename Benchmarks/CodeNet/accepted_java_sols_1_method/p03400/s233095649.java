import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            sum += (d - 1) / a + 1;
        }
        System.out.println(sum + x);
    }
}