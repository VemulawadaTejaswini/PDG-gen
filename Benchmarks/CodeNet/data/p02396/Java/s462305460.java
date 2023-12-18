import java.util.Scanner;

public class Main {
	static StringBuffer buf = new StringBuffer();
    public static void main (String args[]){
    	int count=1;

    	while(true){

        Scanner sc = new Scanner(System.in);
    	    int a = sc.nextInt();
    	    if(count <10000){
    	    	System.out.println("Too Large");
    	    	break;
    	    }
    	    if(1<=a&&a<=1000){
                  String i = Integer.toString(count);
                  System.out.println("Case "+ i +": "+Integer.toString(a) );
                  count++;
    	    }
    	    if(a==0){
    	    	break;
    	    }

    	}
    }
}