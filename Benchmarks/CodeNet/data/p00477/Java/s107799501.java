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
		int sum = 0;
		for(int i = 0; i < 4; i++){
			int a = in.nextInt();
			sum += a;
		}
		System.out.println(sum / 60);
		System.out.println(sum % 60);
	}

}