import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		int n = in.nextInt();
		for(int i=0;i<n;i++)new AOJ0241().doIt();
	}
	class AOJ0241{
		void doIt(){
			int x1 = in.nextInt();//1
			int y1 = in.nextInt();//i
			int z1 = in.nextInt();//j
			int w1 = in.nextInt();//k
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int z2 = in.nextInt();
			int w2 = in.nextInt();
			int x3 = (x1*x2)-(y1*y2)-(z1*z2)-(w1*w2);
			int y3 = (x1*y2)+(x2*y1)+(z1*w2)-(w1*z2);
			int z3 = (x1*z2)+(x2*z1)-(y1*w2)+(w1*y2);
			int w3 = (x1*w2)+(x2*w1)+(y1*z2)-(z1*y2);
			System.out.println(x3+" "+y3+" "+z3+" "+w3);
			
			
		}
	}
	
}