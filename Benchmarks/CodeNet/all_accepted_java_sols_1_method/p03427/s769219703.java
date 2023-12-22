import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[]$){
		String v=s.next();
		System.out.println(v.charAt(0)-'0'-9+v.length()*9
				-(v.matches(".9*")?0:1));
	}
}