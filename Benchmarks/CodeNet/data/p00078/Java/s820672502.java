import java.util.*;
import java.awt.geom.*;
public class Main {
	int INF = 1 << 24;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int [][] data = new int[n][n];
			int count = 0;
			int mid = n / 2;
			data[mid+1][mid] = 1;
			count++;
			int num = 2;
			int xpos = (mid + 1) % n, ypos = (mid + 2) % n;
			while(count != n * n){
				if(data[ypos][xpos] == 0){
					count++;
					data[ypos][xpos] = num++;
					xpos = (xpos + 1) % n;
					ypos = (ypos + 1) % n;
				}
				else{
					xpos = (xpos - 1 + n) % n;
					ypos = (ypos + 1) % n;
				}
			}
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n-1; j++){
					System.out.printf("%2d ",data[i][j]);
				}
				System.out.printf("%2d\n",data[i][n-1]);
			}
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}