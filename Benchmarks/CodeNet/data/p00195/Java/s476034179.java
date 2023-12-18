import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int s1, s2;
	static int [][] store;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		s1 = sc.nextInt(); s2 = sc.nextInt();
		if(s1 == 0 && s2 == 0)return false;
		store = new int[2][5];
		store[1][0] = s1 + s2;
		store[0][0] = 'A';
		for(int i = 1; i < 5; i++){
			s1 = sc.nextInt(); s2 = sc.nextInt();
			store[1][i] = s1 + s2;
			store[0][i] = 'A' + i;
		}
		return true;
	}
	static void solve(){
		int max = store[1][0];
		char index = (char) store[0][0];
		for(int i = 1; i < 5; i++){
			if(max < store[1][i]){
				max = store[1][i];
				index = (char) store[0][i];
			}
		}
		System.out.print(index + " ");
		System.out.println(max);
	}
}