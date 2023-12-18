
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;


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

		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0) return;
			System.out.println(toOct(n));
		}
		
	}

	String toOct(int n) {
		if(n == 0) return new String("0");
		StringBuilder ret = new StringBuilder();
		while(n > 0){
			int m = n % 8;
			if(m >= 4) m++;
			if(m > 5) m++;
			ret.append((char)('0' + m));
			n /= 8;
		}
		ret.reverse();
		return ret.toString();
	}

}