import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String p = sc.next();
		
		StringBuilder sb = new StringBuilder(s);
		sb.append(s);
		
		if(sb.indexOf(p) >= 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}