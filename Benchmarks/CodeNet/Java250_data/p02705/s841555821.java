import java.util.*;
public class Main {// Main
    public static void main(String[] args){
        	Scanner sc=new Scanner (System.in);
		
		double r=sc.nextDouble();
		double circum=2*Math.PI*r;
		System.out.println(String.format("%.20f", circum));
    }
}