import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String lower = "abcdefghijklmnopqrstuvwxyz";
		if(s.charAt(0)!='A') {
			System.out.println("WA");
		}else {
			if(!lower.contains(s.charAt(1)+"")) {
				System.out.println("WA");
				return;
			}
			int Ccount = 0;
			for(int i=2;i<s.length()-1;i++) {
				if(s.charAt(i)=='C') {
					Ccount++;
				}else {
					if(!lower.contains(s.charAt(i)+"")) {
						System.out.println("WA");
						return;
					}
				}
			}
			if(!lower.contains(s.charAt(s.length()-1)+"")) {
				System.out.println("WA");
				return;
			}
			if(Ccount==1) {
				System.out.println("AC");
			}else {
				System.out.println("WA");
			}
		}
		
		
	}

}
