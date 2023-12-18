import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int n = sc.nextInt();
		for(int i =0; i < n;i++){
			BigInteger bi1 = new BigInteger(sc.next());
			BigInteger bi2 = new BigInteger(sc.next());
			BigInteger ans = bi1.add(bi2);
			if(ans.toString().length() > 80){
				System.out.println("overflow");
			}else{
				System.out.println(ans);
			}
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}