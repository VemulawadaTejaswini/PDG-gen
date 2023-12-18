import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int num;
	
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	//read Function
	static boolean read(){
		if(sc.hasNextInt()) num = sc.nextInt();	
		if(num == 0) return false;
		
		return true;
	}
	
	//solve Function
	static void solve(){
		int table[] = {0, 1, 2, 3, 5, 7, 8, 9};
		
		String s = Integer.toOctalString(num); //8ツ進ツ青板づ可陛渉環キ
		
		for(int i=0; i<s.length(); i++){// ツ各ツ個づ可妥篠つオツづ陛渉環キ
			int num2 = Integer.parseInt(""+s.charAt(i), 8);
			System.out.print(table[num2]);
		}
		System.out.println();
	}
	
}