import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

    		double a=(double)sc.nextInt();
    		double b=(double)sc.nextInt();

    		double d=a/b;
    		double r=a%b;
    		double f=a/b;

    		System.out.print((int)d);
    		System.out.print(" "+(int)r+" ");
    		System.out.println(String.format("%.5f",f));

    		}
    		}
    		
