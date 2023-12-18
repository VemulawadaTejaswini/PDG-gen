import java.util.Scanner;

public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] h = new int[n][600];
			for(int i=0;i<n;i++){
				int d = sc.nextInt();
				int t = sc.nextInt();
				int[] a = new int[d];
				for(int j=0;j<d;j++)a[j]=sc.nextInt();
				for(int j=0;j<600;j++)h[t][j]+=a[j%d];
			}
			int max = 0;
			for(int t=0;t<n;t++)for(int i=0;i<600;i++)max = Math.max(max, h[t][i]);
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}