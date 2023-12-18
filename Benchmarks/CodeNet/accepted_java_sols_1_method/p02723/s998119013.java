import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		Boolean ans = false;
		if(S.substring(2, 3).equals(S.substring(3, 4)) && S.substring(4, 5).equals(S.substring(5, 6))) {
			ans = true;
		}
		
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
		
	}
	
}