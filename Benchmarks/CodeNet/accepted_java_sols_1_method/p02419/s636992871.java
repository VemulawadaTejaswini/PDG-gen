import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		String T = "";
		int count = 0;
		while(true) {
			T = sc.next();
			if(T.equalsIgnoreCase(W)) {
				count++;
			} else if(T.equals("END_OF_TEXT")) {
				break;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
	
}
