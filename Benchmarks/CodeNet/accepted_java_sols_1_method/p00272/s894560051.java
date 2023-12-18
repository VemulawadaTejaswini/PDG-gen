import java.util.Scanner;
class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int t=sc.nextInt();
			int n=sc.nextInt();
			int S=1;
			int A=2;
			int B=3;
			int C=4;
			int  ans=0;
			if(t==S){
				 ans=6000*n;
			} if(t==A){
				ans=4000*n;
			} if(t==B){
				ans=3000*n;
			}  if(t==C){
				ans=n*2000;
			}
			System.out.println(ans);
		}

	}
}