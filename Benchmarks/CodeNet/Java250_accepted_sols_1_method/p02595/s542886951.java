import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d, x, y, num = 0;
        n = sc.nextInt();
        d = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            double dist = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
            if(dist <= d) ++num;
        }
        System.out.println(num);
        sc.close();
    }
}
