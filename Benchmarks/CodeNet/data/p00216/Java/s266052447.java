import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int w;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		w = sc.nextInt();
		if(w == -1)return false;
		return true;
	}
	static void solve(){
		int cost = 0;
		if( w <= 10){
			cost = 1150;
		}else if( w >= 10 && w <= 20){
			cost = 1150 + 125*(w-10);
		}else if( w >= 20 && w <= 30){
			cost = 1150 + 1250 + 140*(w-20);
		}else{
			cost = 1150 + 1250 + 1400 + 160*(w-30);
		}
		//System.out.println("cost = " + cost);
		System.out.println( 4280 - cost );
	}

}