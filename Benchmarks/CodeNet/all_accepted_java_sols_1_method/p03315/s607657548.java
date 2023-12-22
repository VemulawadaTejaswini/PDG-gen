import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		int count = 0;
		
		for(int i = 0; i < 4; i++) {
			if(a.charAt(i) == '+') {
				count++;
			} else {
				count--;
			}
		}
		System.out.println(count);
	}

}