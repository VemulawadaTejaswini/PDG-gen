import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			if(n==0 && a==0 && b==0 && c==0 && x==0) break;
			
			int[] y = new int[n];
			for(int i=0;i<n;i++) y[i] = sc.nextInt();
			
			int count=0;
			boolean flag = false;
			for(int i=0;i<=10000;i++){
				if(x==y[count]) count++;
				if(count==n){
					System.out.println(i);
					flag = true;
					break;
				}
				x = (a*x+b)%c;
			}
			if(flag==false) System.out.println(-1);
		}	
	}	
}