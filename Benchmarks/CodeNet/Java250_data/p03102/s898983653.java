import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int c = scanner.nextInt();
		//int ary[][]= new int[n][m];
		int ans= 0;
		int b[]= new int[m];
		for(int l = 0; l<m; l++) {
			b[l]= scanner.nextInt();
		}
		for(int s=0; s<n; s++) {
			int tmp = c;
			for(int t=0; t<m; t++) {
				//ary[s][t]= scanner.nextInt();
			tmp += b[t]*scanner.nextInt(); 
			}
			if(tmp>0)ans++;
			
		}
		System.out.println(ans);
	}

}