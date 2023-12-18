import java.util.Scanner;

class Main{

	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
	    
		Double x1=sc.nextDouble();
		Double y1=sc.nextDouble();
		Double x2=sc.nextDouble();
		Double y2=sc.nextDouble();
		
		System.out.printf("%f",distance(x1,y1,x2,y2));
		
	}
	private static double distance(double x1,double y1,double x2,double y2) {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}

		
		
}
