import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String a = scan.next();
            String b = scan.next();
            BigInteger ab = (new BigInteger(a)).add(new BigInteger(b));
            if(ab.toString().length() > 80) System.out.println("overflow");
            else System.out.println(ab);
        }
    }
}