import java.util.Scanner;
public class Main {
	void execute(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int a[][] = new int[n][m];
		int b[] = new int[m];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				a[i][j] = s.nextInt();
			}
		}
		for(int i = 0;i < m;i++){
			b[i] = s.nextInt();
		}
		for(int i = 0;i < n;i++){
			int ans = 0;
			for(int j = 0;j < m;j++){
				ans+=a[i][j]*b[j];
			}
			System.out.println(ans);
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.execute();
	}
}