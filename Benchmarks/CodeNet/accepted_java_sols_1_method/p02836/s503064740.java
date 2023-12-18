import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s = scan.next();
		int len = s.length();
		int count = 0;

		for(int i=0;i< len/2 ;i++) {
			if(s.charAt(i) != s.charAt(len-1-i)){
				count ++;
			}
		}

		System.out.println(count);
	}
}
