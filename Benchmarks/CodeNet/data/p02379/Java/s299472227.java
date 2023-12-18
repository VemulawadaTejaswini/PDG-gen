import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt(); 
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int xy =  (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
		double dist = Math.sqrt(xy);
		
		System.out.println(dist);
			
		
	}

}

