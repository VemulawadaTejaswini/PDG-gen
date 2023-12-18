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
		int[] a = new int[10];
		for(int i = 0; i < 10; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int b = a[9] + a[8] + a[7];
		System.out.println(b + " ");
		for(int i = 0; i < 10; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		b = a[9] + a[8] + a[7];
		System.out.println(b);
	}

}