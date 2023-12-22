import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Double> ans = new ArrayList<>();
		
		while(true) {
			int n = sc.nextInt();
			
			if(n == 0) {
				break;
			}
			
			int sum = 0;
			
			int[] s = new int[n];
			
			for(int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum+=s[i];
			}
			
			double avg = (double)sum / n;
			double disp = 0;
			
			for(int i = 0; i < n; i++) {
				disp+=(double)Math.pow(s[i] - avg, 2);
			}
			disp/=n; 
			
			double stDev = Math.sqrt(disp);
			
			ans.add(stDev);
		}
		
		for(int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
}