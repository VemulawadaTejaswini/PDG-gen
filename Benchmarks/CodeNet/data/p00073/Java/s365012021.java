import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int x,h,S;
	
	void a(){
		while(true){
			x=sc.nextInt();
			h=sc.nextInt();
			if(x==0 && h==0)break;
			
			S=sc.nextInt();
			
			double s=x*Math.sqrt(4*h*h+x*x)+x*x; 
			
			System.out.println(s);
		}
	}
	public static void main(String[]agrs){
		new Main().a();
	}
}