import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s=sc.next();
			int count=0;
			if(s.charAt(0)=='A') count++;
			int c=0;
			for(int i=2; i<=s.length()-2; i++) {
				if(s.charAt(i)=='C') {
					c++;
				}
			}
			if(c==1) count++;
			if(count>=2) {
				boolean tf=true;
				for(int i=0; i<s.length(); i++) {
					if(s.charAt(i)=='A' || s.charAt(i)=='C') {
						continue;
					}
					if(Character.isUpperCase(s.charAt(i))) {
						tf=false;
						break;
					}
				}
				if(tf) count++;
			}
			System.out.println((count==3)?"AC":"WA");

		}
	}
}