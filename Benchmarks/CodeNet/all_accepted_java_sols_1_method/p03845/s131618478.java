import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int N=Integer.parseInt(in.next());
		
		int T[]=new int[N];
		for(int i=0;i<N;i++)T[i]=Integer.parseInt(in.next());
		
		int M=Integer.parseInt(in.next());

		int P[]=new int[M];
		int X[]=new int[M];
		for(int i=0;i<M;i++){
			P[i]=Integer.parseInt(in.next())-1;
			X[i]=Integer.parseInt(in.next());
		}
		
		int min[]=new int[M];
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++)
				min[i]=min[i]+T[j];
			for(int n=0;n<N;n++)
				if(P[i]==n){
					min[i]=min[i]-T[n]+X[i];
					break;
				}		
			System.out.println(min[i]);
		}
		in.close();
	}
	
}