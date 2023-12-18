import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		StringBuilder n = new StringBuilder();
		n.append(sc.next());
		for(int i = 0; i < n.length(); i++) {
			sum += n.charAt(i);
		}
		
		if(sum % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
				
	}

}