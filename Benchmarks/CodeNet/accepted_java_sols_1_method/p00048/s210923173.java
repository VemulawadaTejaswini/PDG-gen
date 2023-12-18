// クラス
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	double[] clz = {48.00, 51.00, 54.00, 57.00, 60.00, 
			64.00, 69.00, 75.00, 81.00, 91.00};
	String[] name = {"light fly", "fly", "bantam", "feather", "light",
			 "light welter", "welter", "light middle", "middle",
			 "light heavy"};
	while(kbd.hasNext()){
	    double w = kbd.nextDouble();
	    int i=0;
	    while(i<clz.length && w>clz[i]) i++;
	    if(i < clz.length){
		System.out.println(name[i]);
	    }
	    else{
		System.out.println("heavy");
	    }
	}
    }
}