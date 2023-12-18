import java.util.*;
class H15_03{
	Scanner sc=new Scanner(System.in);
	
	void d(){
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a+b;
		
		System.out.println((c+"").length());
		
	}
	public static void main(String[]agrs){
		new H15_03().d();
	}
}