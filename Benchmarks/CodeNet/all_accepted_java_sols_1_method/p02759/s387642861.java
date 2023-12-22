import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double ans;

        if (N%2 == 0)
            ans = N/2.0;
        else
            ans = N/2.0 + 0.5;

        System.out.println((int)ans);
    }
}
