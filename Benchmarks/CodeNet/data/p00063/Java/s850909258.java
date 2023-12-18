import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	boolean reverce(String str) {
		for (int i=0;i<str.length()/2;i++) 
			if (str.charAt(i) != str.charAt(str.length()-1-i)) return false;
		return true;
	}
	
	void run() {
		int count = 0;
		while (sc.hasNext()) {
			if (reverce(sc.next())) count ++; 
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}