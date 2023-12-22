import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(less9x9checker(n));
	}
	
	static String less9x9checker(int n) {
		for(int i = 0; i < 10; i++) {
			for(int ii = 0; ii < 10; ii++) {
				if(n == i*ii){
					return "Yes";
				}
			}			
		}
		return "No";
	}

}
