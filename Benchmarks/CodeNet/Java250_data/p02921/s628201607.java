import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String k = s.next();
		String t = s.next();
		
		int ctr=0;
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)==t.charAt(i))
				ctr++;
		}
		System.out.println(ctr);
		
	}
}
