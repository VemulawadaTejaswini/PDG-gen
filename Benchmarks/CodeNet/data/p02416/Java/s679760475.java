import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			int sum = 0;
			if(str.equals("0")) {
				break;
			}
			
			for(int n = 0; n < str.length();n++) {
				sum += Integer.parseInt(str.substring(n, n+1));
			}
			System.out.println(sum);
		}
	}
}

