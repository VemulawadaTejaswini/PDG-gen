import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		long n,i,b,ans;
		Scanner sc = new Scanner(System.in);
			n= sc.nextLong();
			ans = sc.nextLong();
			for(i=2;i<=n;i++){
				if(ans!=-1){
					b = sc.nextLong();
					ans=ans*b;
					if(ans>1000000000000000000L){
						ans=-1;
					}
				}	
				else{
					b = sc.nextLong();
					if(b==0){
						ans=0;
					}
				}	
			}
		System.out.println(ans);
	}
}