import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] fishingData;
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if( !sc.hasNext() )return false;
		n = sc.nextInt();
		fishingData = new int[n][2];
		for(int i = 0; i < fishingData.length; i++){
			fishingData[i][0] = sc.nextInt();
			fishingData[i][1] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		int max = -1;
		for(int i = 0; i < fishingData.length; i++){
			max = Math.max(max, fishingData[i][1]);
		}
		int res = -1;
		for(int i = 0; i < fishingData.length; i++){
			if( fishingData[i][1] == max ){ res = fishingData[i][0]; break; }
		}
		System.out.println(res + " " + max);
	}
}