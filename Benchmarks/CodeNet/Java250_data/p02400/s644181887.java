import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	Double r=sc.nextDouble();
	System.out.printf("%7f %7f\n",r*r*Math.PI,r*2.0*Math.PI);
    }
}