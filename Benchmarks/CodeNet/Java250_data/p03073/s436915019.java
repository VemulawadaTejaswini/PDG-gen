
import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		char []ch = scan.next().toCharArray();
		int count = 0 ;
		for(int i = 1 ; i<ch.length ; i++) {
			if(ch[i]==ch[i-1]) {
				count++;
				if(ch[i-1] == '0')
					ch[i] = '1';
				else
					ch[i] = '0' ;
			}
		}
		System.out.println(count);
	}
}
