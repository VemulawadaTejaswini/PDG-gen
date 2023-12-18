
import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	while(sc.hasNext()){
    		new aoj0054().doIt();
    	}
    }
    class aoj0054{
    	void doIt(){
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		if(a >= b)a = a % b;
    		int n = sc.nextInt();
    		int sum = 0;
    		for(int i = 0;i < n;i++){
    			a = a * 10;
    			sum += a / b;
    			a = a % b;
    		}
    		System.out.println(sum);
    	}
    }
}