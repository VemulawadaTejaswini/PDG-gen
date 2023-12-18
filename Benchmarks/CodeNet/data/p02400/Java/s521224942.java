import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	double r,IP = 3.141592653589;
    	r = scan.nextDouble();
    	System.out.println(r*r*IP + " " + 2*r*IP);
    }
}