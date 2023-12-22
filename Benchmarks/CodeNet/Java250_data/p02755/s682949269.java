import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int i=1;i<=1000;i++) {
			double x = i*0.08;
			double y = i*0.1;
			int eight = (int)x;
			int ten = (int)y;
			if(eight==a && ten==b) {
				System.out.println(i);
				System.exit(0);
			}
		}
			
		System.out.println(-1);
		
	}	
}
