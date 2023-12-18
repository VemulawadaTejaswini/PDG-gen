import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		int hako[][] = new int[h+1][w+1];
		int tate[] = new int[h+1];
		int yoko[] = new int[w+1];
		
		int Xmax = 0;
		int Ymax = 0;
		int Xmasu = 0;
		int Ymasu = 0;
		int ans = 0;
		
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			int y= sc.nextInt();
			
			hako[x][y] = 1;
			tate[x]++;
			yoko[y]++;
		}
		//プラス
		for(int i=1;i<=h;i++) {
			if(Xmax < tate[i]) {
				Xmax = tate[i];
				Xmasu = i;
			}
		}
		for(int i=1;i<=w;i++) {
			if(Ymax < yoko[i]) {
				Ymax = yoko[i];
				Ymasu = i;
			}
		}
		if(hako[Xmasu][Ymasu] == 1) {
			ans = Xmax+Ymax-1;
		}
		else {
			ans = Xmax+Ymax;
		}
		Xmax=0; Ymax=0;
		//マイナス
		for(int i=h;i>0;i--) {
			if(Xmax < tate[i]) {
				Xmax = tate[i];
				Xmasu = i;
			}
		}
		for(int i=w;i>0;i--) {
			if(Ymax < yoko[i]) {
				Ymax = yoko[i];
				Ymasu = i;
			}
		}
		if(hako[Xmasu][Ymasu] == 1 && ans<Xmax+Ymax-1) {
			ans = Xmax+Ymax-1;
		}
		else if(ans < Xmax+Ymax){
			ans = Xmax+Ymax;
		}
		
		System.out.println(ans);
	}
}
