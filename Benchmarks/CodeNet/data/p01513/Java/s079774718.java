import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new A().doIt();
	}
	class A{
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				boolean a[][] = new boolean [n+1][n+1];
				for(int i = 0;i < n;i++){
					int h = sc.nextInt();
					for(int j = 0;j < h;j++){
						int m = sc.nextInt();
						a[i][m] = true;
					}
				}
				int out = sc.nextInt();
				int b[] = new int [out];
				for(int i = 0;i < out;i++){
					b[i] = sc.nextInt();
				}
				int cnt = -1;
				boolean batu = true;
				for(int i = 0;i < n;i++){
					int ans = 0;
					for(int j = 0;j < out;j++){
						if(a[i][b[j]] == true)ans++;
						if(ans == out){
							if(cnt != -1){
								batu = false;
							}
							cnt = i;
						}
					}
				}
				if(!batu)System.out.println("-1");
				else{
					if(cnt != -1)System.out.println(cnt+1);
					else System.out.println("-1");
				}
			}
		}
	}
}