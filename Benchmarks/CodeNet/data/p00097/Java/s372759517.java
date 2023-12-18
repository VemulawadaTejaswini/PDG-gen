import java.util.*;

public class Main {

	public static void main(String[] args) {
		int n,s,max,count;
		
		count = 0;
		n=9;
		max=100;
		s=200;
		Scanner sc = new Scanner(System.in);
		
		for(;;){
		
			n = sc.nextInt();
			s = sc.nextInt();
		
			if(n==0&&s==0)break;
				
			count = check(n,s,max);
		
			System.out.println(count);
		}
	}

	private static int check(int n, int s,int max) {
		int count = 0;
		
		if(s<max) max=s;
		
		for(;max>=0;max--){
		if(n>1  && (s-max) <= n*max)			count += check(n-1,s-max,max-1);
		else if(n==1 && s==max) 	return 1;
		else if(n==1)				return 0;
		}
		
		return count;
	}

}