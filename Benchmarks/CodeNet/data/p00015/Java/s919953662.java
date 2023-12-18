import java.math.BigInteger;
import java.util.*;
public class Main {

        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            int n=scan.nextInt();
            while(n!=0){
            	BigInteger bi1 = new BigInteger(scan.next());
            	BigInteger bi2 = new BigInteger(scan.next());
            	BigInteger ans =bi1.add(bi2);
            	if(ans.toString().length()<80)
            	System.out.println(ans);
            	else System.out.println("overflow");
            	n--;
            }
        }
}