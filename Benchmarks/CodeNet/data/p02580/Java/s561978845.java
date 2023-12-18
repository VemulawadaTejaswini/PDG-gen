
import java.util.*;


public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int m=sc.nextInt();
		int[][] map=new int[h][w];
		
		int[] row=new int[h];
		int[] col=new int[w];
	
		
		for(int i=0;i<m;i++) {
			int thisrow=sc.nextInt();
			int thiscol=sc.nextInt();
			
			row[thisrow-1]++;
			col[thiscol-1]++;
			map[thisrow-1][thiscol-1]++;
		}
		
		long ans=0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				long n=row[i]+col[j];
				if(map[i][j]!=0)n--;
				if(n>ans)ans=n;
			}
		}
		
		
		System.out.println(ans);

	}
	
	
}
