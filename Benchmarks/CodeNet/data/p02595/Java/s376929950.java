import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int n = scan.nextInt();
		int d = scan.nextInt();
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
			if(c<=(double)d){
				ans++;
			}
		}
		
		System.out.println(ans);
		

	}

}
