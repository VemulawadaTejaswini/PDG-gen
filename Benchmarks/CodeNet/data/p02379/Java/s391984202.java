import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextInt(); 
		double y1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();
		
		double xy =  (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
		double dist = Math.sqrt(xy);
		
		System.out.println(dist);
			
		
	}

}

