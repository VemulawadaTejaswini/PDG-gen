import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();//南北方向にまっすぐに伸びる 道路
		int H = sc.nextInt();//東西方向にまっすぐに伸びる 道路
		int N = sc.nextInt();//観光スポットの数
		int i;
		int x[] = new int[N];
		int y[] = new int[N];
		int c = 0;
		
		for(i = 0; i < N; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		for(i = 0; i < N-1; i++){
			while(x[i] == x[i+1] && y[i] == y[i+1]){
				if(x[i] < x[i+1] && y[i] < y[i+1]){
					x[i]++;
					y[i]++;
					c++;
				}
				
				else if(x[i] > x[i+1] && y[i] > y[i+1]){
					x[i]--;
					y[i]--;
					c++;
				}
				
				else if(x[i] < x[i+1] && y[i] == y[i+1]){
					x[i]++;
					c++;
				}
				
				else if(x[i] == x[i+1] && y[i] < y[i+1]){
					y[i]++;
					c++;
				}
				
				else if(x[i] > x[i+1] && y[i] == y[i+1]){
					x[i]--;
					c++;
				}
				
				else if(x[i] == x[i+1] && y[i] > y[i+1]){
					y[i]--;
					c++;
				}
				
				else if(x[i] > x[i+1] && y[i] < y[i+1]){
					x[i]--;
					c++;
				}
				
				else if(x[i] < x[i+1] && y[i] > y[i+1]){
					y[i]--;
					c++;
				}
			}

		}
		
		System.out.println(c);
		
		
		
	}

}