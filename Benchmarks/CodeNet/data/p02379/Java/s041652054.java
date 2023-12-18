import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble(); 
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double xy =  (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
		double dist = Math.sqrt(xy);
		
		System.out.println(dist);
			
		
	}

}

