import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int T=sc.nextInt();
		int[] c=new int[N];
		int[] t=new int[N];
		int sum=0;
		int min=1000;
		for(int i=0;i<N;i++) {
			c[i]=sc.nextInt();
			t[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			if(t[i]<=T) {
				sum=1;
			}
			
		}
		for(int i=0;i<N;i++) {
			if(t[i]<=T)
				if(min>=c[i]){
					min=c[i];
					
				}
			
		}
		
		
		
		
		
		
		
		
		if(sum==0) {
			System.out.println("TLE");
		}else {
			System.out.println(min);
			
		}
		
		
		
	}

}