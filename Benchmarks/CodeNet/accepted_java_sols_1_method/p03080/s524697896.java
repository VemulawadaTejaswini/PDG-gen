import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt();
		String s = sc.next();
		
		int countR = 0;
		int countB = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				countR++;
			}else {
				countB++;
			}
		}
		
		if(countR > countB) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
