import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		int x = sc.nextInt(); int y = sc.nextInt();
		int i,k,xmax = -100,ymin = 100,flg = 1; 
		int[] arX = new int[n]; int[] arY = new int[m];
		for(i = 0;i < n;i ++) {
			arX[i] = sc.nextInt();
			if(i == 0) {
				xmax = arX[i];
			}else {
				if(xmax < arX[i]) xmax = arX[i];
			}
		}
		for(i = 0;i < m;i++) {
			arY[i] = sc.nextInt();
			if(i == 0) {
				ymin = arY[i];
			}else {
				if(ymin > arY[i]) ymin = arY[i];
			}
		}
		int d = ymin - xmax;
		for(i = 0;i < d;i ++) {
			if((x < xmax+(i+1)) && ((xmax+(i+1)) <= y)) flg = 0;
		}
		if(ymin <= xmax || flg == 1) System.out.println("War");
		else {
			for(i = 0;i < n;i ++) {
				for(k = 0;k < m;k ++) {
					if(arX[i] > arY[k]) flg = 1; 
				}
				if(flg == 1) {System.out.println("War"); return;}
			}
			System.out.println("No War");
		}
	}
}