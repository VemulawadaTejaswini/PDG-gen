import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		StringBuilder value = new StringBuilder();
		for (int i = 0; i < n.length(); i++) {
			switch (n.charAt(i)) {
				case '1' :
				value.append('9');
				break;
				case '9' :
				value.append('1');
				break;
				default :
				value.append(n.charAt(i));
			}
		}
		System.out.println(value);
	}
	
}