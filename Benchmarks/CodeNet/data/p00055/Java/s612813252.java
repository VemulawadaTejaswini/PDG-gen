//Volume0-0055
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		final float EVEN = 0;
		      float a,sum,pre;

        //input
        Scanner sc = new Scanner(System.in);
        while((sc.hasNext())){
        	a = sc.nextFloat();

        	//calculate
        	sum = a;
        	pre = a;
        	for(int i=2;i<=10;i++){
        		if(i%2 == EVEN){
        			sum += pre = pre * 2;
        		} else {
        			sum += pre = pre / 3;
        		}
        	}

        	//output
        	System.out.printf("%.8f",sum);
        }
	}
}