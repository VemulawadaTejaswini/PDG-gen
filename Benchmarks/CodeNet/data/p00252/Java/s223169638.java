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
		int[] b = new int[3];
		for(int i = 0; i < 3; i++) b[i] = in.nextInt();
		if(((b[0] & b[1]) | b[2]) == 1) System.out.println("Open");
		else System.out.println("Close"); 
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }