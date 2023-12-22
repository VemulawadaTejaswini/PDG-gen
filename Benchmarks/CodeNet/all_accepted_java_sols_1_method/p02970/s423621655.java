import java.util.*;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a = n / (2*d + 1);
        int mod = n % (2*d + 1);
        if(mod != 0){
            a += 1;
        }
        System.out.println(a);
    }
}
