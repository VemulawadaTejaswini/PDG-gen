import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String ans = "";
        String s = "zabcdefghijklmnopqrstuvwxy";
        char[] c = s.toCharArray();


        while(true){
            long mod = N % s.length();
            ans =  c[(int)mod] + ans;

            if( ( (N -1) / s.length()) < 1){
                break;
            } else{
                N = ((N-1) / s.length());
            }

        }

        System.out.println(ans);

    }

}
