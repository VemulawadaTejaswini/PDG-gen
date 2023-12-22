import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int redCounter = 0;
		int blueCounter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				redCounter++;
			} else {
				blueCounter++;
			}
		}
		System.out.println(Math.min(redCounter, blueCounter)*2);
    }
  
}
