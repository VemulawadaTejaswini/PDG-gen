//Volume0-0057
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		int n,sum;

        //input
        Scanner sc = new Scanner(System.in);
        while((sc.hasNext())){
        	n = sc.nextInt();

        	//calculate
        	sum = 1;
        	for(int i=1;i<=n;i++){
        		sum += i;
        	}

        	//output
        	System.out.println(sum);
        }
	}
}