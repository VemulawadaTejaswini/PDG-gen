import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			double v = a/(double)b;
			
			int s=0;
			for(int i=0; i<n; ++i){
				s += (v*Math.pow(10., (double)(i+1)))%10;
			}
			
			System.out.println(s);
		}
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}