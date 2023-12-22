import java.util.Scanner;

public class Main {
	public	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();
		int n = 0;
		while(true) {
			String s = sc.next();
			 if(s.contains("END_OF_TEXT")){
				System.out.println(n);
				break;
			}
			s = s.toLowerCase( );
			if(s.equals(w)){
				n += 1;
			}
		}
	}
}


