import java.util.*;

class Main{
	static int a;
	static int b;
	static int c;
	static int d;
	static int e;
	static int p;
	static double f;
	static int g;
	static int h;
	static int i;
	static int j;
	static int k;
	static int l;
	static int m;
	static int o;
	static int q;
	static double r;
	static int s;
	static int t;
	static int u;
	static double x;
	static double y;
	private static Scanner sc;
	public static void main(String[]agrs){
		sc=new Scanner(System.in);
		a=sc.nextInt();
		String op=sc.next();
		b=sc.nextInt();
		System.out.println();
		while(true){
			if(op.equals("+")){
			  System.out.println(a+b);
			}else if(op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("*")){
				  System.out.println(a*b);
			}else if(op.equals("/")){
				  System.out.println(a/b);
			}else if(op.equals("?"))break;
			a=sc.nextInt();
			op=sc.next();
			b=sc.nextInt();
			
			
		}
		
		
		
		
	}
}