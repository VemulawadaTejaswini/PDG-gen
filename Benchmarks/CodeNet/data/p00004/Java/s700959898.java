import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class int2{
		double x;
		double y;
		int2(double x,double y){
			this.x = x;
			this.y = y;
		}
		double vec(int2 tar){
			return this.x*tar.y - this.y*tar.x;
		}
	}
	
	void run() {
		for (;;) {
			if (!sc.hasNextInt())
				break;
			int[] sim = new int[6];
			for(int i =0; i < 6 ; i++){
				sim[i] = sc.nextInt();
			}
			int2 x = new int2(sim[0],sim[3]);
			int2 y = new int2(sim[1],sim[4]);
			int2 u = new int2(sim[2],sim[5]);
			
			Double ansy = (x.vec(u)/ x.vec(y)); 
			Double ansx = (u.vec(y)/ x.vec(y)); 
			String outx = ansx.toString()+"00";
			String outy = ansy.toString()+"00";
			if(outx.equals("-0.000")){
				outx = outx.substring(1);
			}
			if(outy.equals("-0.000")){
				outy = outy.substring(1);
			}
			int indexx = outx.indexOf('.');
			int indexy = outy.indexOf('.');
			
			System.out.println(outx.substring(0,indexx+1) + outx.substring(indexx+1,indexx+4) +" "+ outy.substring(0,indexy+1) + outy.substring(indexy+1,indexy+4));		
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();

	}
}