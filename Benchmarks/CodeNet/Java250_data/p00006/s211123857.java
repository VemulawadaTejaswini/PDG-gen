
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		
		String s = sc.next();
		
		StringBuffer strBuf = new StringBuffer(s);
		
		strBuf = strBuf.reverse();
		
		s = strBuf.toString();
		
		System.out.println(s);
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}