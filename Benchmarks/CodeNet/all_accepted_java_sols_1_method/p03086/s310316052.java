import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		String s = sc.nextLine();
		
		int count = 0;
		int maxLength = 0;
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'G'|| s.charAt(i) == 'C'|| s.charAt(i) == 'T'){
				count++;
				maxLength = Math.max(count, maxLength);
			}else {
				count = 0;
			}
		}

		System.out.println(maxLength);
		
	}

}