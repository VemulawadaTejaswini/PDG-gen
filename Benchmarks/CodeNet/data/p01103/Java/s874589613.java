
import java.util.Scanner;

public class Main {

	public static int[][] pond;
	
	public static void main(String[] args) {
		int d, w, count;
		Scanner sc = new Scanner(System.in);
		while (true) {
			w = sc.nextInt();
			if (w == 0) {
				break;
			}
			d = sc.nextInt();
			count = 0;
			
			pond = new int[w][d];
			
			for(int i=0;i<w;i++) {
				for(int j=0;j<d;j++) {
					pond[i][j] = sc.nextInt();
				}
			}
			
			for(int iw=0;iw<w-2;iw++) {
				for(int id=0;id<d-2;id++) {
					for(int jw=iw+2;jw<w;jw++) {
						for(int jd=id+2;jd<d;jd++) {
							count = Math.max(count, calc(iw,id,jw,jd));
						}
					}
				}
			}
			
			System.out.println(count);
			
		}//while
		sc.close();
	}
	
	public static int calc(int iw,int id,int jw, int jd) {
		int height=10;
		for(int w=iw;w<=jw;w++) {
			height = Math.min(pond[w][id], height);
			height = Math.min(pond[w][jd], height);
		}
		for(int d=id+1;d<jd;d++) {
			height = Math.min(pond[iw][d], height);
			height = Math.min(pond[jw][d], height);
		}
		
		int depth=0;
		for(int w=iw+1;w<jw;w++) {
			for(int d=id+1;d<jd;d++) {
				if(height <= pond[w][d]) {
					return 0;
				}
				depth += height - pond[w][d];
			}
		}
		
		
		return depth;
	}

}
