import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	
	void d(){
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a+b;
		
		System.out.println((c+"").length());
		
	}
	public static void main(String[]agrs){
		new Main().d();
	}
}