import java.util.Scanner;
	
	public class Main{
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
		int N=sc.nextInt();
		int p[]=new int [N];
		int sum=0;
		int psum=0;
		int ansd=0;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			p[i]=sc.nextInt();
			sum+=p[i];
		}
		
		for(int i=0;i<(1<<N);i++){
			psum=0;
			for(int r=0;r<N;r++){
				if((i>>r)%2==1){psum+=p[r];}
			}
			ansd=Math.abs(sum-psum*2);
			ans=Math.min(ansd,ans);
		}
		
		if(N!=0)System.out.println(ans);
		}}