import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String s = stdIn.next();
			if(s.equals("-"))
				break;
			int m = stdIn.nextInt();
			for (int i=0; i<m; i++) {
				int h = stdIn.nextInt();
				String temp = s.substring(h,s.length());
				temp += s.substring(0,h);
				s = temp;
			}
			System.out.println(s);
		}
	}
}