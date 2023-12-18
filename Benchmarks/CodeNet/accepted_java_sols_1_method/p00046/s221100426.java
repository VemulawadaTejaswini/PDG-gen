//Volume0-0046
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		float h,
		      max = 0,
		      min = Float.MAX_VALUE;

        //input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	h = sc.nextFloat();

        	//calculate
        	if(max < h){max = h;}
        	if(min > h){min = h;}
        }

        //output
        System.out.println(max - min);
	}
}