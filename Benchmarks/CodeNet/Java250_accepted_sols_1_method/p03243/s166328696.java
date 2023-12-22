import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int intAns = 0;
		
		for (int i = 1; i < 10; i++) {
			
			n -= 111;
			
			if (n <= 0) {
				intAns = i;
				break;
			}
		}
		
		String ans = String.valueOf(intAns);
		
		System.out.println(ans + ans + ans);
	}
}