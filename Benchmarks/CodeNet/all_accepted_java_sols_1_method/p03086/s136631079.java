import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int ans = 0;
		int l = 0;
		boolean flag = false;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == 'A' || c[i] == 'C'
					|| c[i] == 'G' || c[i] == 'T') {
				l++;
				flag = true;
			}else {
				if(flag && ans <= l)ans = l;
				flag = false;
				l = 0;
			}
		}
		if(flag && ans <= l)ans = l;
		System.out.println(ans);
	}

}