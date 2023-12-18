import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k =0;
		String bef = "";
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<s.length();i++) {
			sb.append(s.charAt(i));
			if (sb.toString().equals(bef)==false) {
				bef= sb.toString();
				sb = new StringBuffer();
				k++;
			}
		}
		System.out.println(k);
	}
}