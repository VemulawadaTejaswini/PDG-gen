import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean [] number = new boolean[1000001];
		number[0] = false;
		number[1] = false;
		for(int i=2;i<=1000000;i++) {
			number[i] = true;
		}
		for(int i=2;i<=500000;i++) {
			for(int j=2;j<=1000000/i;j++) {
				number[i*j] = false;
			}
		}
		while(true) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n==-1 && p==-1) break;

			int [] prime = new int[1000001];
			for(int i=0,j=2;j<=1000000;j++) {
	    		if(number[j]) {
	    			prime[i] = j;
	    			i++;
	    		}
	    	}
	   
			List<Integer> ans=new ArrayList<Integer>();
			int a = 0;
			while(prime[a]<=n) a++;
			
			for(int i=a;i<a+p;i++) {
				for(int j=i;j<a+p;j++) {
					ans.add( prime[i] + prime[j]);
				}
			}
			Collections.sort(ans);
			
			System.out.println(ans.get(p-1));
		}
	}
}
