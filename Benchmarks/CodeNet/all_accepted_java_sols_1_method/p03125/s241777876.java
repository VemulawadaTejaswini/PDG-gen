import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        System.out.println(b%a==0?a+b:b-a);

    }
}
