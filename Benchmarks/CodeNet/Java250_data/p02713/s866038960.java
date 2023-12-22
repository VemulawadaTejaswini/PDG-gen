import java.util.Scanner;
//import java.util.Random;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);

		int k=stdIn.nextInt();
		
		long ans=0;
		for(int i=1;i<=k;++i){
			for(int j=1;j<=k;++j){
				for(int l=1;l<=k;++l){
					ans+=gcd(i,gcd(j,l));
				}
			}
		}
		
		System.out.println(ans);
	}
	
	static int gcd(int x,int y){
		return (y==0)?x:gcd(y,x%y);
	}
}