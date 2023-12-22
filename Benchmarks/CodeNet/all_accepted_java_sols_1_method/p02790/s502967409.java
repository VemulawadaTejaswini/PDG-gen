import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		String ans = "";
		if(a > b) {
			for(int i = 0; i < a;i++) {
				ans += String.valueOf(b);
			}
		}else {
			for(int i = 0; i < b;i++) {
				ans += String.valueOf(a);
			}

		}
		
		System.out.println(ans);
		
	}
	
	
	

}