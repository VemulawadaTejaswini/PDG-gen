import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),a=sc.nextInt();
        n=n%500;
        System.out.println(a>=n?"Yes":"No");
    }
}
