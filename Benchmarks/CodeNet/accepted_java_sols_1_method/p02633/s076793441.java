import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int result = 0;
		int kakudo = 0;
		while(true) {
			result++;
			kakudo += n;
			if (kakudo%360==0) {
				break;
			}
		}
		System.out.println(result);
	}
	
}