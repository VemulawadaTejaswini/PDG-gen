import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String s1,s2;

		if(s.length()%2==0) {
			s1 = s.substring(0, s.length()/2);
			s2 = s.substring(s.length()/2, s.length());
		}else {
			s1 = s.substring(0, s.length()/2);
			s2 = s.substring(s.length()/2+1, s.length());
		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int cnt = 0;
		for(int i = 0;i < ch1.length;i++) {
			if(ch1[i]!=ch2[ch2.length-i-1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}