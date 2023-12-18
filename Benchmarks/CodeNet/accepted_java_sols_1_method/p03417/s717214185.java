import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = (long)Math.abs(n - 2) * Math.abs(m - 2);
        System.out.println(ans);
        sc.close();

    }

}
