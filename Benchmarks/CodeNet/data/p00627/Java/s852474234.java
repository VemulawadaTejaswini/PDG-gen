import java.util.*;
public class Main {
	static int n, score;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		score = 0;
		if(n == 0)
			return false;
		for(int i = 0; i < n/4; i++){
			score += sc.nextInt();
		}
		return true;
	}
	static void solve(){
		System.out.println(score);
	}

}