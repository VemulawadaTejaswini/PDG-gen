import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        if(S.equals("RRR")){
            ans = 3;
        } else if(S.equals("SSS")){
            ans = 0;
        } else if(S.equals("SRR") || S.equals("RRS")){
            ans = 2;
        } else {
            ans = 1;
        }
        System.out.println(ans);





    }

}


