import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			
			int colSum[] = new int[c];
			int total = 0;
			
			for(int i = 0; i < r; i++) {
				int rowSum = 0;
				for(int j = 0; j < c; j++) {
					int num = sc.nextInt();
					rowSum += num;
					colSum[j] += num;
					total += num;
					
					sb.append(num);
					sb.append(" ");
				}
				sb.append(rowSum);
				sb.append("\n");
			}
			
			for(int i = 0; i < c; i++) {
				sb.append(colSum[i]);
				sb.append(" ");
			}
			
			sb.append(total);
			
			System.out.println(sb.toString());
		}
	}
}
