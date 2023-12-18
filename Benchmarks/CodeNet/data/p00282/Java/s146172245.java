import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){

		String[] k = {"Mts","Fks","Nyt","Asg","Ggs","Gok","Sai","Sei","Kan","Ko","Jou","Jo","Gai","Kei","Cho","OKU","Man"};
		BigInteger zero = new BigInteger("0");

		while(in.hasNext()){
			String s = in.next();
			int n = in.nextInt();

			BigInteger m = new BigInteger(s);

			if(n == 0 && m.compareTo(zero) == 0) return;

			for(int i = 0; i < n; i++){
				m = m.multiply(m);
			}

			BigInteger d = new BigInteger("10");
			d.pow(68);

			BigInteger a;

			for(int i = 0; i < k.length; i++){
				if(m.compareTo(zero) == 0) break;
				a = new BigInteger(m.toString());
				a.divide(d);
				if(m.compareTo(zero) != 0) System.out.println(a.toString() + k[i]);
				m.mod(d);
				d.divide(new BigInteger("10000"));
			}
			System.out.println();
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }