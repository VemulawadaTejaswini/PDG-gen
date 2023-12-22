import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double ans = 0;
        double odd = 0;
        if(N % 2 == 0) odd = N / 2;
        else odd = (N + 1) / 2;
        ans = odd / N;
        System.out.println(ans);
    }
}