import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		
		int min_cost = 1001;
		int c = 0;
		int t = 0;
		
		for(int i=0; i<N; i++){
			c = sc.nextInt();
			t = sc.nextInt();
			if(t <= T){
				if(c < min_cost){
					min_cost = c;
				}
			}
		}
		if(min_cost == 1001){
			System.out.println("TLE");
		}
		else{
			System.out.println(min_cost);
		}
	}
}