import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int row,col;
		int[] cols;
		int cnt_min = 10*10000;

		row = scn.nextInt();
		col = scn.nextInt();
		cols = new int[col];

		for(int i=0; i<row; i++) for(int j=0; j<col; j++)
			cols[j] = (cols[j]<<1)+scn.nextInt();
		
		for(int i=0; i<(1<<(row-1)); i++){
			int cnt=0;
			for(int column : cols){
				int tmp=0;
				column=column^i;
				for(int j=0; j<row; j++,column >>= 1)
					tmp += column&1;
				cnt += (tmp<(row-tmp))?tmp:(row-tmp);
			}
			cnt_min = (cnt<cnt_min)?cnt:cnt_min;
		}

		System.out.println(row*col-cnt_min);
	}
}