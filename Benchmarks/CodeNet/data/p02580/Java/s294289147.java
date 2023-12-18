
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int t = scn.nextInt();
		int arr[][] = new int[r][c];
		int rowsum[] = new int[r];
		int colsum[] = new int[c];
		for(int i=0;i<t;i++)
		{
			int a = scn.nextInt();
			int b = scn.nextInt();
			arr[a-1][b-1]= 1;
			rowsum[a-1]++;
			colsum[b-1]++;
		}
		int maxrow = Integer.MIN_VALUE;
		int maxcol = Integer.MIN_VALUE;
		int mr = 0;
		int mc = 0;
		for(int i=0;i<r;i++)
		{
			if(maxrow<rowsum[i])
				{
					maxrow = rowsum[i];
					mr = i;
				}
		}
		int ans =0;
		for(int i=0;i<c;i++)
		{
			if(arr[mr][i]!=0)
				colsum[i]--;
			if(maxcol<colsum[i])
				{
					maxcol = colsum[i];
					mc = i;
				}
		}
		//System.out.println(mr+" "+mc);
		System.out.print(maxrow+maxcol);
	}
}