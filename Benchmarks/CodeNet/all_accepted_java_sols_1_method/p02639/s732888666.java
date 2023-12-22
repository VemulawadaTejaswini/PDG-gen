import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int ans = 0;
		for(int i = 1; i < 6; i++) {
			num = scan.nextInt();
			if(num == 0) {
				ans = i;
			}
		}
		System.out.println(ans);
		
		
	}

}
