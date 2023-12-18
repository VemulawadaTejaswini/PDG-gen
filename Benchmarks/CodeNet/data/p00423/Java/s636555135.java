import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		solve();
	}

	private static void solve(){
		Scanner sc=new Scanner(System.in);

		while(true){
			int n=sc.nextInt();
			int A=0,B=0;
			if(n==0)break;
			for(int i=0;i<n;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a>b)
					A+=a+b;
				else if(a<b)
					B+=a+b;
				else{
					A+=a;
					B+=b;
				}
			}
			System.out.println(A+" "+B);
		}
	}
}