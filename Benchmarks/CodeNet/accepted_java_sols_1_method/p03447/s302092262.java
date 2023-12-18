import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        x-=a;
        x=x%b;
        System.out.println(x);
    }
}
