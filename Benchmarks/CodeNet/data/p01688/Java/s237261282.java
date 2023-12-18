import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public int maximum(int a,int b){
		return (a > b)?a:b;
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int D = scan.nextInt();
			int[] w = new int[20];
			int[] v = new int[20];
			int p = 0;
			int x = scan.nextInt();
			for(int i = 0;i < x;i++){
				w[i] = 1;
				v[i] = (scan.next().equals("D"))?scan.nextInt():0*scan.nextInt();
			}
			p = x;
			int y = scan.nextInt();
			for(int i = 0;i < y;i++){
				w[i+p] = 2;
				v[i+p] = (scan.next().equals("DD"))?scan.nextInt():0*scan.nextInt();
			}
			p+=y;
			int[] dp = new int[D+1];
			for(int i = 0;i < p;i++){
				for(int j = D;j >= w[i];j--){
					dp[j] = maximum(dp[j],dp[j-w[i]] + v[i]);
				}
			}
			System.out.println(dp[D]);
		}
	}
}