import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int i = 1;
			int x;
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				x = i;
				
				if(x % 3 == 0) {
					sb.append(" " + i);
				} else {
					while(true) {
						if(x % 10 == 3) {
							sb.append(" " + i);
							break;
						}
						
						x/=10;
						if(x == 0) {
							break;
						}
					}
				}
				
				++i;
				if(i > n) {
					break;
				}
			}
			
			System.out.println(sb.toString());
		}
	}
}
