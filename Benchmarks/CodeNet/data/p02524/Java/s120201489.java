import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int ab=s.nextInt();
		System.out.printf("%8f\n",(double)a*b*Math.sin(Math.PI*ab/180)/2);
		System.out.printf("%8f\n",a+b+Math.sqrt(a*a+b*b-(double)a*b*Math.cos(Math.PI*ab/180)/2));
		System.out.printf("%8f",(double)b*Math.sin(Math.PI*ab/180));
	}
}