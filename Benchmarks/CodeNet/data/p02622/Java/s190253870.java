import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int count = 0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=(b.charAt(i))) {
				//String s = a.replace(a.charAt(i), b.charAt(i));
				count++;
			}
		}
		System.out.println(count);
	}
}