import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		solve();
	}


	public static void solve(){
		String str = sc.next();

		for(int i=str.length(); i>=0; i--){
			System.out.print(str.charAt(i));
		}
	}

}