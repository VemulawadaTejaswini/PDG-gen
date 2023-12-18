import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int mask = 0 ; mask < (1<<4) ; mask++) {
			String formula = "";
			int sum = 0;
			for(int i = 0 ; i < 4 ; i++) {
				if((mask&(1<<i)) >= 1) {
					if(i == 0) formula += s.charAt(i);
					else formula += "+" + s.charAt(i);
					sum += s.charAt(i) - '0';
				} else {
					if(i == 0) formula += s.charAt(i);
					else formula += "-" + s.charAt(i);
					sum -= s.charAt(i) - '0';
				}
			}
			if(sum == 7) {
				System.out.println(formula + "=7");
				return;
			}
		}
	}

}
