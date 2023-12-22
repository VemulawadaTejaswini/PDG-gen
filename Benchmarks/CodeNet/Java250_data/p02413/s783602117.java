import java.util.Scanner;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		input();
		solve();
	}

	static int r, c, sheet[][];

	private static void input(){
		r=s.nextInt();
		c=s.nextInt();
		sheet=new int[r+1][c+1];
	}

	private static void solve(){
		for(int i=0; i<r; i++){
			int buf;
			for(int j=0; j<c; j++){
				buf=s.nextInt();
				sheet[i][c]+=buf;
				sheet[r][j]+=buf;
				System.out.printf("%d ",buf);
			}
			System.out.println(sheet[i][c]);
		}
		for(int j=0; j<c; j++){
			sheet[r][c]+=sheet[r][j];
			System.out.printf("%d ",sheet[r][j]);
		}
		System.out.println(sheet[r][c]);
	}
}