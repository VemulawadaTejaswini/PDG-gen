import java.util.*;
public class Main{
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	
	void ab(){
		a=sc.nextInt();
		b=sc.nextInt();
		
		int d = a / b;
	    int r = a % b;
		double f = 1.0 * a / b; 
		
		System.out.print(d);
		System.out.print(" ");
		System.out.print(r);
		System.out.print(" ");
		System.out.println(f);
		
	}
	
	public static void main(String[] args){     
		new Main().ab();     
		} 
	}