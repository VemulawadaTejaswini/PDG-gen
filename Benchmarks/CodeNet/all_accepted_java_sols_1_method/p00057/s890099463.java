//Volume0-0057
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		int n;

        //input
        Scanner sc = new Scanner(System.in);
        while((sc.hasNext())){
        	n = sc.nextInt();

        	//output
        	System.out.println(1+n*(1+n)/2);
        }
	}
}