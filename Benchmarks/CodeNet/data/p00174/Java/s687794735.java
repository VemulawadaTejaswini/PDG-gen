import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);	
	static String s;
	static int a, b;
	static int i;
	
	public static void main(String[] args) {

		while(read()){
			solve();
		}
		
	}
	
	static boolean read() {
		
		s = sc.next();
		
		if(s.charAt(0)=='0') return false;
		
		return true;
	}
	
	static void solve() {

		a = 0;
		b = 0;
		
		for(int i=1; s.length() > i; i++){
			if(s.charAt(i) == 'A') a++;
			if(s.charAt(i) == 'B') b++;
			
			
 		}
		
		if(a > b){
			a++;
		}else{
			b++;
		}
		
		System.out.println(a+" "+b);
	}

}