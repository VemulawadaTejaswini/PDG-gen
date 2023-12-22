import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		String s = Integer.toString(n);
		
		if(s.charAt(0) == '7' || s.charAt(1) == '7'||s.charAt(2) == '7') {
		    System.out.println("Yes");
		}
		else System.out.println("No");
		
	}
}