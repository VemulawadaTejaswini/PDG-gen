import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int x = 0;
		int y = 0;
		for (int i=0; i<n; i++) {
			String s1 = stdIn.next();
			String s2 = stdIn.next();
			if(s1.compareTo(s2) > 0){
				x += 3;
			}else if (s1.compareTo(s2) < 0) {
				y += 3;
			}else {
				x ++;
				y ++;
			}
		}
		System.out.println(x+" "+y);
	}
}