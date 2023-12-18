import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int gsd = 1;
	    if (a>b) {
		    while (a%b !=0)
		    {
		    	int aim = b;
		        b=a%aim;
		        a=aim;
			    gsd=b;
		    }
		    System.out.println(gsd);
	    }
	    else if (a<b) {
	    	while (b%a !=0) {
	    		int aim = a;
	    	    a=b%aim;
	    	    b=aim;
			    gsd=a;
	    	}
	    	System.out.println(gsd);
	    }
	    else {
	    	System.out.println(a);
	    }
	    in.close();
	}
}
