import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	void solve(int n){
		Set<Integer> surplus=new HashSet<Integer>();
		int []appearance=new int[(n-1)/2];
		
		for(int i=1;i<n;++i){
			surplus.add((i*i)%n);
		}
		for(int a:surplus){
			for(int b:surplus){
				if(a==b)continue;
				int c=a-b;
				c=c<0?c+n:c;
				c=c>(n-1)/2?n-c:c;
				++appearance[c-1];
			}
		}
		for(int i=0;i<(n-1)/2;++i){
			System.out.println(appearance[i]);
		}
	}
	
	void io(){
		Scanner s=new Scanner(System.in);
		while(true){
			int n=s.nextInt();
			if(n==0)break;
			solve(n);
		}
		s.close();
	}

	public static void main(String[] args) {
		new Main().io();
	}

}