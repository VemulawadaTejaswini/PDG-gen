import java.util.Arrays;
import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int input[] = new int[5];
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}
	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		for(int i = 0; i < 5; i++){
			input[i] = sc.nextInt();
		}
		
		return true;
	}
	
	public static void solve(){
		
		Arrays.sort(input);
		
		System.out.println(input[4] + " " + input[3] + " " + input[2] + " " + input[1] + " " + input[0]);
	}

}