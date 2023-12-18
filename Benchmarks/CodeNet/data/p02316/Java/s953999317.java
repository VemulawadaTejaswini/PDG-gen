import java.util.Scanner;
 
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new DPC().doIt();
	}
	class DPC{
		int DP(int v[],int w[],int N,int W,int all[]){
			int result = 0;
			for(int i = 0;i < W;i++){
				for(int j = 0;j < N;j++){
					if(i + w[j] <= W){
						all[i+w[j]]=Math.max(all[i+w[j]], all[i] + v[j]);
						if(result < all[i+w[j]])result = all[i+w[j]];
					}
				}
			}
			return result;
		}
		void doIt() {
			int N = sc.nextInt();
			int W = sc.nextInt();
			int v[] = new int [N];
			int w[] = new int [N];
			int all[] = new int [W+1];
			for(int i = 0;i < N;i++){
				v[i] = sc.nextInt();
				w[i] = sc.nextInt();
			}
			System.out.println(DP(v,w,N,W,all));
		}
	}
}