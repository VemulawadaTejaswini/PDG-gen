import java.math.*;
import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int iter=0; iter<n; iter++){
			BigInteger a = in.nextBigInteger(),
						b = in.nextBigInteger();
			String str = a.add(b).toString();
			if(str.length()>80){
				System.out.println("overflow");
			}
			else
				System.out.println(str);
		}
	}

}