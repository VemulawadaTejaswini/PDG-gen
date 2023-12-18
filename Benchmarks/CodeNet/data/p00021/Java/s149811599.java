import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^0-9.]+");
		
		int n = scan.nextInt();

		for(int i=0;i<n;i++){
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			double x4 = scan.nextDouble();
			double y4 = scan.nextDouble();

			if(Math.abs((x2-x1)*(y4-y3)-(y2-y1)*(x4-x3))<0.0001){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		
		scan.close();
	}
}