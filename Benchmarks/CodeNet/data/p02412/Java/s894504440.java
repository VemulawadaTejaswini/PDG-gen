import java.util.Scanner;
public class Main {
	void hmw(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		while(n != 0||x != 0){
			int cnt = 0;
			for(int i = 1;i <= n - 2;i++){
				for(int j = i + 1;j <= n - 1 && (i+j)*3 < x*2 ;j++){
					int k = x - (i + j);
					if(k <= n && k > j){
//System.out.println("#"+i + ":" + j + ":" + k);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			n = s.nextInt();
			x = s.nextInt();
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.hmw();
	}
}