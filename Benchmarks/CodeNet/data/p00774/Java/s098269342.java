
import java.util.Scanner;

public class Main {
	static int H;
	static int[][] stone=new int[11][6];
	
	static int search() {
		int len;
		int point=0;
		for(int row=0; row<H; row++) {
			for(int col=0; col<=2; col++) {
				for(len=1; col+len<=4; len++) {
					if(stone[row][col]!=stone[row][col+len]) {
						break;
					}
				}
				if(len<=2) {
					continue;
				}
				point+=stone[row][col]*len;
				for(int i=0; i<len; i++) {
					stone[row][col+i]=0;//消滅させる石
				}
			}
		}
		return point;//その状態のpoint
	}
	
	static void change() {
		for(int col=0; col<5; col++) {
			for(int min=1; min<H; min++) {
				for(int row=H-1; row>=min; row--) {//落とせるところまで落とす
					if(stone[row][col]==0) {
						stone[row][col]=stone[row-1][col];//下に落とす
						stone[row-1][col]=0;//一つ上は消去
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				H=sc.nextInt();
				if(H==0) break;
				for(int i=0; i<H; i++) {
					for(int j=0; j<5; j++) {
						stone[i][j]=sc.nextInt();
					}
				}
				int sum=0;
				int cont;
				while(true) {
					cont=search();
					if(cont==0) {
						System.out.println(sum);
						break;
					}
					sum+=cont;
					change();//移動
				}
			}
		}
	}
	
}
