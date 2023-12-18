import java.util.Scanner;
class Main{
     public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int x1 = scan.nextInt();
    	int y1 = scan.nextInt();
    	int x2 = scan.nextInt();
    	int y2 = scan.nextInt();
    	double num = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
    	double p = Math.sqrt(num); 
    	
    	System.out.println(p);
     }
}