import java.util.*;
public class CP_AB{
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	
	void ab(){
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.print(a/b);
		System.out.print(" ");
		System.out.print(a%b);
		System.out.print(" ");
		System.out.println((float)a/b);
		
	}
	
	public static void main(String[] args){     
		new CP_AB().ab();     
		} 
	}