import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNextDouble()){
    		double x = input.nextDouble();
    		double t = x/9.8;
    		int num = (int)(Math.ceil((4.9*Math.pow(t, 2)+5)/5));
    		System.out.println(num);
    	}
    }
}