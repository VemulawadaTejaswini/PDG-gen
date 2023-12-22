import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int cnt = 0;
		for(int i = A;i <= B;i++) {
			String s1 = String.valueOf(i);
			String s2 = "";
			char[] ch = String.valueOf(i).toCharArray();
			for(int j = ch.length-1;j >= 0;j--) {
				s2 += ch[j];
			}
			if(s1.equals(s2)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}