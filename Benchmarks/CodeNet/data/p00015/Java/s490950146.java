import java.util.Scanner;
import java.math.BigInteger;

public class p0015{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	for(int i = 0; i < n; ++i){
	    BigInteger bi1 = new BigInteger(sc.next());
	    BigInteger bi2 = new BigInteger(sc.next());

	    String result = (bi1.add(bi2)).toString();

	    if(result.length() > 80){
		result = "overflow";
	    }

	    System.out.println(result);
	}
    }
}