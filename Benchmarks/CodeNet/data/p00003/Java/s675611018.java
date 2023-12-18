import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	int c;
	void f(){
		int n=sc.nextInt();
		for(int i=0; i<n; i++){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
		
		
		double a2=Math.pow(a,2);
		double b2=Math.pow(b,2);
		double c2=Math.pow(c,2);
		
		if(c2==a2+b2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		}
	}
	public static void main(String[]agrs){
		new Main().f();
	}
}