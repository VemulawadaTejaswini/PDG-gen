import java.util.Scanner;
 
class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        double x =sc.nextDouble();
        System.out.printf("%.6f",2*Math.PI*x);
    	System.out.println(" ");
    	System.out.printf("%.6f",Math.PI*x*x);
    }
}