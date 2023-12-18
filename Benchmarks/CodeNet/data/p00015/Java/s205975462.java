import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		for(int i = 0;i < n;i++){
			String a = sc.next();
			String b = sc.next();
			BigInteger numa = new BigInteger(a);
			BigInteger numb = new BigInteger(b);
			BigInteger all = numa.add(numb);
			String allnum = all.toString();
			if(allnum.length() > 80){
				System.out.println("overflow");
			}else{
				System.out.println(all);
			}
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}