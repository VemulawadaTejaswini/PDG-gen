import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int max = Math.max(p, q);
        max = Math.max(max, r);
        System.out.println(p + q + r - max);
        sc.close();
    }
}