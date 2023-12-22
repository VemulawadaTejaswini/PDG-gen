import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long K = sc.nextLong();
		if (s.length()==1) {
			System.out.println(K/2);
			return ;
		}
		long count =0;
		boolean b = true;
		for (int i=1;i<s.length();i++) {
			if (s.charAt(i-1)!=s.charAt(i)) {
				b =false;
				break;
			}
		}
		if (b==true) {
			System.out.println(s.length()*K/2);
			return ;
		}
		 b = true;
		for (int i=1;i<s.length();i++) {
			if (s.charAt(i-1)==s.charAt(i)) {
				count ++;
				if (i==s.length()-1) {
					b = false;
				}
				i++;
			}
		}
		for (int i=1;i<s.length();i++) {
			if (s.charAt(i-1)!=s.charAt(i)) {
				if (i%2==0) {
					b =false;
				}
				break;
			}
		}
		if (b==true&&s.charAt(s.length()-1)==s.charAt(0)) {
			System.out.println(count *K+K-1);
		} else {
			System.out.println(count *K);
		}
	}
}