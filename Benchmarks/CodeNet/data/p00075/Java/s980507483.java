//Volume0-0075
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		String[] s;
		int      No;
		double   weight,height;

        //input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	s = sc.nextLine().split(",");
        	No     = Integer.parseInt(s[0]);
        	weight = Double.parseDouble(s[1]);
        	height = Double.parseDouble(s[2]);

        	//calculate
        	if(weight / Math.pow(height,2) >= 25){

        		//output
        		System.out.println(No);
        	}
        }
	}
}