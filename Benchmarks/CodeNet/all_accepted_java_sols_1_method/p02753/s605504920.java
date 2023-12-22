import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] bus = scan.nextLine().toCharArray();
		if(bus[0] == bus[1] && bus[1] == bus[2]) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
