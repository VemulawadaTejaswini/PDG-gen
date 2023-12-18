package DPL_3_A;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int H=in.nextInt(),W=in.nextInt();
		int field[][]=new int[H][W];
		
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				field[i][j]=Integer.parseInt(in.next())==1 ? 0 : 1;
			}
		}
		
		int max=0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(field[i][j]>=1 && isBS(field,i,j)) {
					field[i][j]=Math.min(field[i-1][j], Math.min(field[i][j-1],field[i-1][j-1]))+1;
				}
				max=Math.max(max, field[i][j]);
			}
		}

		System.out.println(max*max);
	}
	
	static boolean isBS(int A[][],int y,int x) {
		if(y-1<0 || x-1<0)return false;
		if(A[y-1][x]>=1 && A[y][x-1]>=1 && A[y-1][x-1]>=1){
			return true;
		}
		else return false;
	}

}

