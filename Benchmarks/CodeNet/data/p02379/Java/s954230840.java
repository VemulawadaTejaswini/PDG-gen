import java.util.Scanner;
class Main{
     public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int x1 = scan.nextInt();
    	int y1 = scan.nextInt();
    	int x2 = scan.nextInt();
    	int y2 = scan.nextInt();
    	
    	double num = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
    	double p = Math.sqrt(num); 
    	
    	System.out.println(String.format("%.8f", p));
     }
}