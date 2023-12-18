import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			int n = sc.nextInt();
			int cnt = 0;
			for(int i=0; i<n; i++) {
				String input = sc.next();
				String search = input + input;
				if(search.indexOf(str) != -1) {
					cnt++;
				}
			}
			System.out.println(cnt);
			
			

			
		}
	}
}




