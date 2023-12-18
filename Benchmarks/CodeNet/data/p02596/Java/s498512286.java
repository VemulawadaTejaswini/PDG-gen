import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int modK = 7 % K;
        int plusmod = 7 % K;

        for(int i = 1;i<K*2;i++){
            if(modK == 0){
                System.out.println(i);
                System.exit(0);
            } else {
                plusmod = (plusmod * 10) % K;
                modK += plusmod;
                modK %= K;
            }
        }

        System.out.println("-1");


    }

}


