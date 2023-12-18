import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
 
		long nico = Long.parseLong(sc.nextLine());
		long maki = nico % 50;
		
		int n = 50;
		System.out.println(n);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			long num = 49 + nico / 50;
			if (i < maki) {
				num = num + 50 - maki + 1;
			} else {
				num = num - maki;
			}
				
			if (i == 0) {
				sb.append(num);
			} else {
				sb.append(" " + num);
			}
		}
		System.out.println(sb);
	}
}