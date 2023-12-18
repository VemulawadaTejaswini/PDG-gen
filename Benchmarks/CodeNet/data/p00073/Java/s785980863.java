import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			int x=sc.nextInt();
			int h=sc.nextInt();
			if((x|h)==0) break;
			double a = (double)x*x+(Math.sqrt((double)x*x/4+h*h))*x*2;
			System.out.println(a);
			
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}