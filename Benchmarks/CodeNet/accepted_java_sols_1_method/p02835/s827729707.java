import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        if (sum >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
        sc.close();
    }
}