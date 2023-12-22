import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String p,S = s.next();
		p=Integer.parseInt(S.substring(5,7))>4?"TBD":"Heisei";
		System.out.println(p);
	}
}