import java.util.*;
class  LS{
	Scanner sc= new Scanner(System.in);
	void aaaa(){
		int gundam=0;
		int n=sc.nextInt();
		int[] N=new int[n];
		for(int i=0;i<n;i++)N[i]=sc.nextInt();
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int Q=sc.nextInt();
			int L=0;
			int R=n-1;
			while(N[L]<Q&&Q<N[R]){
				int cent=(R-L)/2+L;
				if(N[cent]==Q||N[cent+1]==Q){
					gundam++;
					break;
				}else if(N[cent]>Q)r=cent;
				else if(N[cent+1]<Q)l=cent+1;
				else break;
			}
		}
		System.out.println(gundam);
	}
	public static void main(String[]args){
		new LS().aaaa();
	}
}