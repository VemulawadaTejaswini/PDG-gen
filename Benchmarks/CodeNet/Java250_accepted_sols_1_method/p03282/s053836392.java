import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long k = in.nextLong();
		if(k==1) System.out.println(s.charAt(0));
		else {
			int idx = 0;
			while(s.charAt(idx)=='1' && idx<k-1) idx++;
			System.out.println(s.charAt(idx));
		}
		in.close();
	}

}