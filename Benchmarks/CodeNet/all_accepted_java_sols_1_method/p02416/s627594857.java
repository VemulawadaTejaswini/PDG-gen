import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(sc.hasNext()) {
			String s = sc.next();
			if(s.equals("0")) {
				break;
			}
			count=0;
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				int digit = c - '0';
				count+=digit;
			}
			System.out.printf("%d\n", count);
		}
	}
}

