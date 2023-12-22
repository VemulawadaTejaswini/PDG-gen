import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int[] count = new int[2];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0') count[0]++;
			else count[1]++;
		}
		System.out.println(Math.min(count[0], count[1])*2);
		in.close();
	}

}
