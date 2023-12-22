import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		int index = 1;
		while(val > 0) {
			System.out.println("Case " +  index + ": " + val);
			index++;
			val = sc.nextInt();
		}
	}
}
