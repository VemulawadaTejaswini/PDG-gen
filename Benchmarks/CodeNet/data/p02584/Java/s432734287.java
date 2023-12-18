import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			long x=input.nextLong();
		    long k=input.nextLong(),d=input.nextLong();
		    
		    for(long i=0;i<k;i++) {
		   x=Math.abs((x)-(d));
		    }
		   System.out.println(x);
		}

	}