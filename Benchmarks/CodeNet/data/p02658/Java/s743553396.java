import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger ans = new BigInteger("1");
        boolean b = true;
        for (int i=0;i<n&&b;i++){
            ans=ans.multiply(new BigInteger(sc.next()));
            if (ans.toString().length()>18&& !ans.toString().equals("1000000000000000000")){
                b=false;
                ans = new BigInteger("-1");
            }
        }
        System.out.println(ans.toString());
    }
}
