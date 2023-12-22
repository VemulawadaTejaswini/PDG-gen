import java.util.*;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		String[] aa = a.split("");
		String[] bb = b.split("");
		String[] cc = c.split("");
		String message = "NO"; 
			if ( (aa[aa.length-1].equals( bb[0] )) && ( (bb[bb.length-1].equals(cc[0]))) ){
				message = "YES";
			}
				System.out.println(message);
	}
}