import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		while(true){
			int n = Integer.parseInt(scan.nextLine());
			if(n == 0) break;
			String str = scan.nextLine();
			String[] points = str.split(" ");
			
			double m = 0.0;
			for (int i = 0; i < n; i++) {
				m += Integer.parseInt(points[i]);
			}
			m /= n;
			
			double num = 0.0;
			for (int i = 0; i < n; i++) {
				num += Math.pow((Integer.parseInt(points[i]) - m ), 2);
			}
			
			System.out.printf("%.8f\n", (Math.sqrt(num / n)));
			
		}
				
	}
}