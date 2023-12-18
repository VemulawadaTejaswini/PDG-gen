import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] mountains;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		mountains = new int[10];
		for(int i = 0; i < 10; i++){
			mountains[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		//Arrays.sort(mountains);
		for(int i = 0; i < 10; i++){
			for(int j = i; j < 10; j++){
				if(mountains[j] < mountains[i]){
					int swap = mountains[i];
					mountains[i] = mountains[j];
					mountains[j] = swap;
				}
			}
		}
		System.out.println(mountains[9]);
		System.out.println(mountains[8]);
		System.out.println(mountains[7]);
	}

}