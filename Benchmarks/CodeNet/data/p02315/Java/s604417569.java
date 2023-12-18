import java.util.Scanner;
 
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new DPB().doIt();
	}
	class DPB{
		int DP(int v[],int w[],int N,int W,int all[]){
			int result = 0;
			all[0] = 1;
			for(int i = 0;i < N;i++){
				for(int j = W-1;j >= 0;j--){
					if(j + w[i] <= W){
						if(all[j] > 0){
							if(all[0] == 1)all[0] = 0;
							all[j+w[i]]=Math.max(all[j+w[i]], all[j] + v[i]);
							all[0] = 1;
						}
						if(result < all[j+w[i]])result = all[j+w[i]];
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