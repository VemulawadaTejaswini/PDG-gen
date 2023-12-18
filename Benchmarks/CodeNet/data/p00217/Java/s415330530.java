
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
			int ap = 0, ad = 0;
			for(int i = 0; i < n; i++){
				int p = in.nextInt(), d = in.nextInt() + in.nextInt();
				if(d > ad) {
					ap = p;
					ad = d;
				}
			}
			System.out.print(ap);
			System.out.print(" ");
			System.out.println(ad);
		}
	}

	

}