import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		double ans = 0.0;
		ans += Math.max(0.0,(double)(N-K+1))/(double)N;
		for(int i=1; i<=Math.min(N, K-1);i++){
			double tmp_ans = 1.0/(double)N;
			int tmp_i = i;
			while(tmp_i<K){
				tmp_ans *= 0.5;
				tmp_i *= 2;
			}
			ans += tmp_ans;
		}
		System.out.println(ans);
		
		
		sc.close();
	}
	
	
	
}