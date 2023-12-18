//Volume0-0055
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		final double EVEN = 0;
		      double a,sum,pre;

        //input
        Scanner sc = new Scanner(System.in);
        while((sc.hasNext())){
        	a = sc.nextDouble();

        	//calculate
        	sum = a;
        	pre = a;
        	for(int i=2;i<=10;i++){
        		if   (i%2 == EVEN){pre *= 2;}
        		else              {pre /= 3;}
        		sum += pre;
        	}

        	//output
        	System.out.println(sum);
        }
	}
}