import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int n = in.nextInt();
		
		int[][] ans = new int[h][w];
		//ArrayList<Integer> lst = new ArrayList<Integer>();
		
		int[] lst = new int[n];
		for(int i=0;i<n;i++)
			lst[i]=in.nextInt();
		int j =0;
		int cur = 1;
		int pos = 0;
		for(int i=0;i<h;i++){
			while(j>=0&&j<w){
				ans[i][j]=pos+1;
				j+=cur;
				if(lst[pos]==1)
					pos++;
				else
					lst[pos]--;
				
				
			}
			cur*=-1;
			j+=cur;
			
			
		}
		
		for(int i=0;i<h;i++){
			for( j=0;j<w;j++){
				System.out.print(ans[i][j]+ " " );

			}
			System.out.println();
		}
	}
}
