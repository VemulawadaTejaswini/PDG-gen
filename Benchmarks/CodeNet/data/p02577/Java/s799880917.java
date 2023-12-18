import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  S = sc.next();

        long sum = 0;
        for(int i=0;i<S.length();i++){
            sum += Integer.valueOf(S.charAt(i) - '0');
        }
        if(sum % 9 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}


