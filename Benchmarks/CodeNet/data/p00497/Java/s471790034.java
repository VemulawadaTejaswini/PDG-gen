import java.util.Arrays;
import java.util.Scanner;

//Nails
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] t = new int[n+1][];
		for(int i=1;i<=n;i++){
			t[i] = new int[i+1];
			Arrays.fill(t[i], -1);
		}
		while(m--!=0){
			int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt();
			t[a][b] = Math.max(t[a][b], x);
		}
		int res = 0;
		for(int i=1;i<=n;i++)for(int j=1;j<=i;j++){
			if(i>1){
				if(i!=j)t[i][j] = Math.max(t[i][j], t[i-1][j]-1);
				if(j!=1)t[i][j] = Math.max(t[i][j], t[i-1][j-1]-1);
			}
			res+=t[i][j]>=0?1:0;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}