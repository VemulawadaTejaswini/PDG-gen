// Volume2-0216
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
		final int END = -1;
		      int w,price;
		
    	//input
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		w = sc.nextInt();
    		if(w==END){break;}
    		
    		//calculate
    		if(w <= 10){
    			price = 1150;
    		} else if(10 < w && w <= 20){
    			price = 1150+(w-10)*125;
    		} else if(20 < w && w <= 30){
    			price = 2400+(w-20)*140;
    		} else {
    			price = 3800+(w-30)*160;
    		}
    		//output
    		System.out.println(4280-price);
    	}
	}
}