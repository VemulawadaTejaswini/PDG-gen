import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int ab=s.nextInt();
		System.out.println((double)a*b*Math.sin(Math.PI*ab/180)/2);
		System.out.println(a+b+Math.sqrt(a*a+b*b-(double)a*b*Math.cos(Math.PI*ab/180)/2));
		System.out.println((double)b*Math.sin(Math.PI*ab/180));
	}
}