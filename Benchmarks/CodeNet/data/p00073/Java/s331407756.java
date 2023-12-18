import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	double x,h;
	void q(){
		while(true){
			x=sc.nextDouble();
			h=sc.nextDouble();
			if(x==0&&h==0)break;
		
		
			double s=x*x+x*Math.sqrt(x*x+h*h*4.0);
			System.out.println(s);
			
		}
	}
	public static void main(String[]agrs){
		new Main().q();
	}
}
		