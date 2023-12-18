import java.util.Scanner;
	
	public class Main{
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
		int sum=0;
		int psum=0;
		int ansd=0;
		int ans;
		while(true){
		int N=sc.nextInt();
		if(N==0){break;}
		int p[]=new int [N];
		for(int i=0;i<N;i++){
			p[i]=sc.nextInt();
			sum+=p[i];
		}
		ans=sum;
		for(int i=0;i<(1<<N);i++){
			psum=0;
			for(int r=0;r<N;r++){
				if((i>>r)%2==1){psum+=p[r];}
			}
			ansd=Math.abs(sum-psum*2);
			ans=Math.min(ansd,ans);
		}
		
		System.out.println(ans);}
		}}