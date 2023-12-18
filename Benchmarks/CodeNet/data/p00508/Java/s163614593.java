import java.util.*;
import java.lang.Math.*;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		int[][] point;
		while(scan.hasNext()){
			int n = scan.nextInt();
			point = new int[n][2];
			for(int i = 0;i < n;i++){
				point[i][0] = scan.nextInt();
				point[i][1] = scan.nextInt();
			}
			int t = 0;
			int d = 0;
			int x = 0;
			int y = 0;
			for(int i = 0;i < n-1;i++){
				for(int j = i+1;j < n;j++){
					x = Math.abs(point[i][0]-point[j][0]);
					y = Math.abs(point[i][1]-point[j][1]);
					if(t == 0 || t > x+y){
						t = x+y;
						d = x*x+y*y;
					}
				}
			}
			System.out.println(d);
		}
	}
}