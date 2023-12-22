import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(calculator9x9(a,b));

	}
	
	static int calculator9x9(int a, int b) {
		if(a > 9 || b > 9) {
			return -1;
		}else {
			return a*b;
		}		
	}
}

