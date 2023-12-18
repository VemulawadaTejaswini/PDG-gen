
import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	new aoj0059().doIt();
    }
    class aoj0059{
    	double roop(double x,double q){
    		if(Math.abs((x*x*x) - q) < 0.000001)return x;
    		return roop(x - (((x*x*x) - q) / (3*x*x)),q);
    	}
    	void doIt(){
    		while(true){
    			double q = sc.nextDouble();
    			if(q == -1)break;
    			double x1 = q / 2;
    			System.out.println(roop(x1,q));
    		}
    	}
    }
}