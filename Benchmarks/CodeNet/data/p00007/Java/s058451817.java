import java.util.Scanner;


public class Main{
	
	static Scanner sc = new Scanner(System.in);

	static int loan = 100000, week;
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		week = sc.nextInt();
		
		return true;
	}
	
	public static void solve(){
		
		for(int i = 0; i < week; i++){
			loan *= 1.05;
			if(loan % 1000 != 0){
				loan += 1000 - loan % 1000;
			}
		}
		System.out.println(loan);
	}

}