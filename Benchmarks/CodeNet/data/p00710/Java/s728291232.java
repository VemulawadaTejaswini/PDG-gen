import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n[]=new int[50];
		int r[]=new int[50];
		int i=0;
		int count=0;
		int p[][]=new int[50][50];
		int c[][]=new int[50][50];
		//入力
		for(;;) {
			n[i]=sc.nextInt();
			r[i]=sc.nextInt();
			if(n[i]==0&&r[i]==0) {
				break;
			}
			for(int j=1;j<=r[i];j++) {//j回目のシャッフル
				p[i][j]=sc.nextInt();
				c[i][j]=sc.nextInt();
			}
			i++;
			count++;
		}
		//演算
		i=0;
		int cards[][]=new int[50][50];
		for(;;) {
			if(n[i]==0&&r[i]==0) {
				break;
			}
			for(int k=1;k<=n[i];k++) {
				cards[i][k]=n[i]-k+1;
			}
			for(int j=1;j<=r[i];j++) {
				int w[]=new int[50];
				System.arraycopy(cards[i], p[i][j], w, 0,c[i][j]);
				System.arraycopy(cards[i], 1, cards[i], c[i][j]+1, p[i][j]-1);
				System.arraycopy(w, 0, cards[i],1 , c[i][j]);
			}
			i++;
		}
		//出力
		for(i=0;i<count;i++) {
			System.out.println(cards[i][1]);
		}
	}
}

