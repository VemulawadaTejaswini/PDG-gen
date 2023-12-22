import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		if(S.equals("AAA") || S.equals("BBB")) {
			System.out.print("No");
		}else {
			System.out.print("Yes");
		}
		sc.close();
	}
	
}