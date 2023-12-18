import java.util.Scanner;

class Main{
   public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	double r = scan.nextDouble();
    	
    	System.out.println(String.format("%8f", r*r*3.14) + " " + String.format("%8f", 2*r*3.14));
    	
     }
}