import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	public void run(){
		n = sc.nextInt();
		solve();
	}
	public void solve(){
		int ans = 1;
		for(int i = 2; i <= n; i++){
			int check = i * i;
			if(check <= n){
				while(true){
					if(check * i > n){
						if(ans < check) ans = check;
						break;
					}
					check = check * i;
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }	
}
