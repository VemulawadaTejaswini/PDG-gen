import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		
		long ans = 0;
		
		for(int i = 0; i < n.length(); i++) {
			
			ans += n.charAt(i) - '0';
			
		}
		
		System.out.println(((ans % 9 == 0) ? "Yes" : "No"));
		

	}

}