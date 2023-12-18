import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] a = new int[14][14];
		while(s.hasNext()){
			String[] in = s.next().split(",");
			int x = Integer.parseInt(in[0])+2;
			int y = Integer.parseInt(in[1])+2;
			int size = Integer.parseInt(in[2]);
			if(size==1){
				a[x][y]++;
				a[x][y+1]++;
				a[x][y-1]++;
				a[x+1][y]++;
				a[x-1][y]++;
			}else{
				if(size==2){
					med(x,y,a);
				}else{
					if(size==4){break;}
					med(x,y,a);
					a[x][y+2]++;
					a[x][y-2]++;
					a[x+2][y]++;
					a[x-2][y]++;
				}
			}
		}
		int max = 0;
		int num = 0;
		for(int i=2 ; i<12 ; i++){
			for(int j=2 ; j<12 ; j++){
				if(a[i][j]==0)
					num++;
				if(a[i][j] > max)
					max = a[i][j];
			}
		}
		System.out.println(num);
		System.out.println(max);
	}

	static void med(int x, int y, int a[][]){
		a[x][y]++;
		a[x][y+1]++;
		a[x][y-1]++;
		a[x+1][y]++;
		a[x-1][y]++;
		a[x+1][y-1]++;
		a[x+1][y+1]++;
		a[x-1][y-1]++;
		a[x-1][y+1]++;
	}
}