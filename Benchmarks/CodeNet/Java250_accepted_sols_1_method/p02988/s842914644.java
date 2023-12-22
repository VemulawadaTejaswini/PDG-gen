import java.util.*;
public class Main {
	
	static int mod = (int)1e9+7;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //pの個数
		
		int p[] = new int[n];  //{ 0, 0, 0, 0, 0, 0}  n個の配列 
		for(int i=0;i<n;i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			if (i+2 >= n) break;
			int x1 = p[i];
			int x2 = p[i+1];
			int x3 = p[i+2];
			
			if( ((x1>=x2)&&(x2>x3)) || (x3>=x2)&&(x2>x1)) cnt++;
			
		}
		
		System.out.println(cnt);
		
	}
	
}