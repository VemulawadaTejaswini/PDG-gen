import java.util.Scanner;
//import java.util.Random;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		final int n=stdIn.nextInt();
		long ans=0;
		for(int i=1;i<=n;++i){
			if(i%3==0 || i%5==0){}
			else ans+=i;
		}
		
		System.out.println(ans);
	}
}