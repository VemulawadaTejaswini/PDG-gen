import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int c;
		int t;
		int m = 9999;
		int an = 0;
		for(int i = 1; i <= N; i++){
			c = sc.nextInt();
			t = sc.nextInt();
			if(t <= T && c < m){
				an = c;
				m = c;
			}
		}
		if(an == 0){
			System.out.print("TLE");
		}else{
			System.out.print(an);
		}
	}
}
