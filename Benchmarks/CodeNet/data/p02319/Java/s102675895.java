import java.util.*;

public class Main {
	static int N,W,Data[][];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		N=in.nextInt();W=in.nextInt();
		Data=new int[N][2];
		
		for(int i=0;i<N;i++) {
			Data[i][0]=in.nextInt();
			Data[i][1]=in.nextInt();
		}
		
		System.out.println(DP(0,W,0));
	}
	
	static int DP(int i,int limit,int v) {
		if(i==N)return v;
		
		if(limit-Data[i][1]<0)return DP(i+1,limit,v);
		else {
			return Math.max(DP(i+1,limit,v), DP(i+1,limit-Data[i][1],v+Data[i][0]));
		}
	}

}
