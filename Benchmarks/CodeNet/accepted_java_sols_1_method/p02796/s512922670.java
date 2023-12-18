import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] xl=new int[n][2];
		for(int i=0; i<n; i++){
			int x=sc.nextInt();
			int l=sc.nextInt();
			xl[i][0]=x-l;
			xl[i][1]=x+l;
		}
		Arrays.sort(xl,(x,y) -> x[1]-y[1]);
		int ans=1;
		int point=xl[0][1];
		for(int i=1; i<n; i++){
			if(point<=xl[i][0]){
				ans++;
				point=xl[i][1];
			}
		}
		System.out.println(ans);
	}
}
