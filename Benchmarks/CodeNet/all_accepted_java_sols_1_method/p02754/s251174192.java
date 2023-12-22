import java.util.*;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long b = in.nextLong();
		long r = in.nextLong();
		long bl =0;
		bl+=(n/(b+r))*b;
		long rem = n%(b+r);
		if(rem>b){
			bl+=b;
		}
		else{
			bl+=rem;
		}
		System.out.print(bl);
	}
}