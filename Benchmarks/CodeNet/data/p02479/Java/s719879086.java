import java.util.Scanner;
 
class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        double r =sc.nextDouble();
        System.out.printf("%.6f",2*Math.PI*r);
    	System.out.println(" ");
    	System.out.printf("%.6f\n",Math.PI*r*r);
    }
}