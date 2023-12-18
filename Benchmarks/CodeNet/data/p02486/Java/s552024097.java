import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		solve();
	}

	private static void solve(){
		Scanner sc=new Scanner(System.in);

		while(true){
			int n,x,count;
			n=sc.nextInt();
			x=sc.nextInt();
			count=0;
			if(n+x==0)break;
			for(int a=1; a<=n-2; a++)
				for(int b=a+1; b<=n-1; b++)
					for(int c=b+1; c<=n; c++)
						if(a+b+c==x)
							count++;
			System.out.println(count);
		}
	}
}