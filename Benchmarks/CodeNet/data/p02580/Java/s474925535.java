import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		int hako[][] = new int[h][w];
		int tate[] = new int[h];
		int yoko[] = new int[w];
		
		int Xmax = 0;
		int Ymax = 0;
		int Xmasu = 0;
		int Ymasu = 0;
		
		for(int i=0;i<m;i++) {
			int x = -1+sc.nextInt();
			int y= -1+sc.nextInt();
			
			hako[x][y] = 1;
			tate[x]++;
			yoko[y]++;
		}
		
		for(int i=0;i<h;i++) {
			if(Xmax < tate[i]) {
				Xmax = tate[i];
				Xmasu = i;
			}
		}
		for(int i=0;i<w;i++) {
			if(Ymax < yoko[i]) {
				Ymax = yoko[i];
				Ymasu = i;
			}
		}
		
		if(hako[Xmasu][Ymasu] == 1) {
			System.out.println(Xmax+Ymax-1);
			return;
		}
		System.out.println(Xmax+Ymax);
	}
}
