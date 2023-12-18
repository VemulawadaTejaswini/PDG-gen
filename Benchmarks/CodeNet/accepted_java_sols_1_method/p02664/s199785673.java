
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char []s = sc.next().toCharArray();
		
		for(int i = 0 ; i< s.length;i++) {
			if(s[i] == '?') {
				s[i] = 'D';
			}
		}
		String t = String.valueOf(s);
		System.out.println(t);
		
		
		}

	}

