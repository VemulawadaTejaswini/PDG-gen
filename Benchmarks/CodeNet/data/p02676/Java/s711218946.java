import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();

        if(S.length() > K){
            System.out.println(S.substring(0,K) + "...");
        } else {
            System.out.println(S);
        }

    }

}







