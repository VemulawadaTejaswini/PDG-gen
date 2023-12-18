import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.next();
			
			if(s.equals("0")) break;
			
			int sum = 0;
			for(int i = 0; i<s.length(); i++){
				sum+=Character.getNumericValue(s.charAt(i));
			}
			System.out.println(sum);
		}
	}
}
