import java.util.Scanner;
public class Ma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			
			if(x2-x1 == x4 - x3)
				if(y2 - y1 == y4 - y3)
					System.out.println("Yes");
				else
					System.out.println("No");
			else
				System.out.println("No");
		}
		
	}

}