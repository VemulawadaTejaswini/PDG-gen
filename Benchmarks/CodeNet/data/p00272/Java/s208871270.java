import java.util.*;

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
		int[] dat ={0, 6000, 4000, 3000, 2000};
		for(int i = 0; i < 4; i++) {
			int n = in.nextInt(), m = in.nextInt();
			System.out.println(dat[n] * m);
		}
	}

}