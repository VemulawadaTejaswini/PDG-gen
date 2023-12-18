import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int t = sc.nextInt();

        if (Math.abs(n - n2) < (m - m2) * t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



        sc.close();
    }

}