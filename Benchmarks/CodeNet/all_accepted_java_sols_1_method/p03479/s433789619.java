import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		long x=sc.nextLong();
		long y=sc.nextLong();

		long counter=1;

		while(true) {

			x*=2;

			if(y>x) {
				counter++;
			}else if(y==x) {
              	counter++;
				break;
			}else{
            	break;
            }

		}

		System.out.println(counter);

	}


}
