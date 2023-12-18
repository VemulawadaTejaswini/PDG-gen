import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scaneer = new Scanner(System.in);
		
		int n = scaneer.nextInt();
		
		String s = "";
		
		scaneer.close();
		
		for (int i = 0; i < n; i++) {
			
			s = s + "ACL";
		}
		
		System.out.println(s);
	}

}
