import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, a, b = 0;
		int[] page;
		boolean flag = false;
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) return;
			
			StringBuilder sb = new StringBuilder();
			
			page = new int[n + 1];
			for (int i = 0; i < n; i++) {
				page[i] = sc.nextInt();
			}
			
			flag = false;
			for (int i = 0; i < n; i++) {
				a = page[i];
				flag = false;
				for (int j = i + 1; j < n; j++) {
					if (page[j] - page[j - 1] == 1) {
						flag = true;
						b = page[j];
					} else {
						break;
					}
					i++;
				}
				if (flag) {
					sb.append(a);
					sb.append("-");
					sb.append(b);
				} else {
					sb.append(a);
				}
				
				if (i < n - 1) {
					sb.append(" ");
				}
			}
			sb.append("\n");
			
			System.out.println(sb.toString());
		}
	}
}