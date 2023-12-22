import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		boolean flug = false;
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.equals(str2)) {
				flug = true;
				break;
			}
			str2 = str2.substring(str2.length()-1) + str2.substring(0, str2.length()-1);
		}
		
		if(flug) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
      
	}
}