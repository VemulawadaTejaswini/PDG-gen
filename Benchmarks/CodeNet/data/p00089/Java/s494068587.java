import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new aoj0089().doIt();
	}
	class aoj0089 {
		void dp(int n,int j,int i,int a[][],int b[][]){
			if(i > (n + 2)/2){
				b[i][j] = Math.max(b[i][j],a[i][j] + b[i-1][j]);
				b[i][j] = Math.max(b[i][j],a[i][j] + b[i-1][j+1]);
			}else{
				b[i][j] = Math.max(b[i][j],a[i][j] + b[i-1][j]);
				if(j > 0)b[i][j] = Math.max(b[i][j],a[i][j] + b[i-1][j-1]);
			}
		}
		void doIt() {
			int n = sc.nextInt();
			int a[][] = new int [n+2][n+2];
			int b[][] = new int [n+2][n+2];
			a[0][0] = n;
			b[0][0] = n;
			for(int i = 1;i < n+2;i++){
				String str[] = sc.next().split(",");
				for(int j = 0;j < str.length;j++){
					a[i][j] = Integer.parseInt(str[j]);
					dp(n,j,i,a,b);
				}
			}
			System.out.println(b[n+1][0]);
		}
	}
}