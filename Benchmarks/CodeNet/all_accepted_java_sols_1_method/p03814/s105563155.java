import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int min = -1, max = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'A' && min < 0) min = i;
			else if(c == 'Z' && i > max) max= i;
		}
		System.out.println(max - min + 1);
	}
 
}