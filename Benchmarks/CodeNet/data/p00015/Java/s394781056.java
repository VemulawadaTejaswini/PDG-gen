import java.math.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	for(int i = 0 ; i < n ; i++){
	    BigInteger a = s.nextBigInteger();
	    BigInteger b = s.nextBigInteger();
	    BigInteger c = a.add(b);

	    if(c.toString().length() > 80){
		System.out.println("overflow");
	    }
	    else{
		System.out.println(c);
	    }
	}
    }
}