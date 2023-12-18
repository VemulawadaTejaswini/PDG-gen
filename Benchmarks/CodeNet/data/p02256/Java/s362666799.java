import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int gsd = 1;
	    if (a>=b) {
		    while (a%b !=0)
		    {
		    	a=b;
		        b=a%b;
			    gsd=b;
		    }
		    System.out.println(gsd);
	    }
	    else {
	    	while (b%a !=0) {
	    		b=a;
	    	    a=b%a;
			    gsd=a;
	    	}
	    	System.out.println(gsd);
	    }
	    in.close();
	}
}
