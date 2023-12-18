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
		int h1,m1,s1,h2,m2,s2;
		for(int i = 0; i < 3; i++){
			h1 = in.nextInt();
			m1 = in.nextInt();
			s1 = in.nextInt();
			h2 = in.nextInt();
			s2 = in.nextInt();
			m2 = in.nextInt();

			int a = tos(h2,s2,m2) - tos(h1,s1,m1);
			System.out.print(a/3600);
			a %= 3600;
			System.out.print(" ");
			System.out.print(a / 60);
			a %= 60;
			System.out.print(" ");
			System.out.println(a);
		}

	}

	int tos(int h, int m, int s){
		int ret = 0;
		ret += h * 3600;
		ret += m *60;
		ret += s;
	}

}