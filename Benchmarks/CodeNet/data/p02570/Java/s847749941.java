import java.util.*;


public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long D = sc.nextLong();
        long T = sc.nextLong();
        long S = sc.nextLong();

        if(S*T < D){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

}


