import java.util.Arrays;
import java.util.Scanner;

//Autumnal Illumination
public class Main{

	static boolean col(int[][] p, int[][] q){
		for(int i=0;i<4;i++){
			boolean right = true;
			for(int j=0;j<4;j++){
				int x1 = p[(j+1)%4][0]-p[j][0];
				int y1 = p[(j+1)%4][1]-p[j][1];
				int x2 = q[i][0]-p[j][0];
				int y2 = q[i][1]-p[j][1];
				if(x1*y2-x2*y1>0){
					right = false;
					break;
				}
			}
			if(right)return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			while(n--!=0){
				int m = sc.nextInt();
				int[][][] p = new int[m][4][2];
				for(int i=0;i<m;i++)for(int j=0;j<4;j++)for(int k=0;k<2;k++)p[i][j][k]=sc.nextInt();
				boolean[] use = new boolean[m];
				Arrays.fill(use, true);
				int c = 0;
				for(int i=0;i<m;i++){
					if(!use[i])continue;
					c++;
					for(int j=i+1;j<m;j++){
						if(use[j]&&col(p[i], p[j]))use[j]=false;
					}
				}
				System.out.println(c);
			}
		}
	}
}