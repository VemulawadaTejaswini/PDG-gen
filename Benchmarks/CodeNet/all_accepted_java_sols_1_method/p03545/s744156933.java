import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int n = c.length;
		for(int mask = 0 ; mask < (1<<n) ; mask++) {
			String s = "";
			int temp = 0;
			for(int i = 0 ; i < n ; i++) {
				if(i == 0) {
					s += c[i];
					temp += c[i] - '0';
				} else if((mask&(1<<i)) >= 1) {
					s += "+" + c[i];
					temp += c[i] - '0';
				} else {
					s += "-" + c[i];
					temp -= c[i] - '0';
				}
			}
			if(temp == 7) {
				System.out.println(s + "=7");
				return;
			}
		}
	}
}
