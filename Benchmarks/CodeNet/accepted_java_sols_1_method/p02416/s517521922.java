import java.util.Scanner;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String num = sc.next();
			if(num.equals("0")) break;
			int sum = 0;
			for(int i = 0; i < num.length(); i++) {
				sum += num.charAt(i) - 48;
			}
			System.out.println(sum);
		}
	}
}
