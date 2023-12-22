import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				String x = sc.next();
				
				if(x.equals("0")) break;
				
				int sum = 0;
				
				for(int i = 0; i < x.length(); i++) {
					sum += Integer.parseInt(String.valueOf(x.charAt(i)));
				}
				
				sb.append(sum);
				sb.append("\n");
			}
			
			System.out.print(sb.toString());
		}
	}
}
