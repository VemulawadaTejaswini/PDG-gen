import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String output = s;
		
		char lastChar = s.charAt(s.length()-1);

		if(lastChar == 's') {
			System.out.println(output + "es");
		}
		else {
			System.out.println(output + "s");
		}
		
		
	}
}