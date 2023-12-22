//Volume0-0055
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		final double EVEN = 0;
		      double a,sum;

        //input
        Scanner sc = new Scanner(System.in);
        while((sc.hasNext())){
        	a = sc.nextDouble();

        	//calculate
        	sum = a;
        	for(int i=2;i<=10;i++){
        		if   (i%2 == EVEN){a *= 2;}
        		else              {a /= 3;}
        		sum += a;
        	}

        	//output
        	System.out.println(sum);
        }
	}
}