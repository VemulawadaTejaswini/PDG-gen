import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int a,b,c;
		Scanner scan = new Scanner(System.in);

	    a= Integer.parseInt(scan.next());
	    b= Integer.parseInt(scan.next());
	    c= Integer.parseInt(scan.next());
	    
	    if(a<b&&b<c)
	    {
	    	System.out.println(a+" "+b+" "+c);
	    }
	    if(b<a&&a<c)
	    {
	    	System.out.println(b+" "+a+" "+c);
	    }
	    if(a<c&&c<b)
	    {
	    	System.out.println(a+" "+c+" "+b);
	    }
	    if(b<c&&c<a)
	    {
	    	System.out.println(b+" "+c+" "+a);
	    }
	    if(c<b&&b<a)
	    {
	    	System.out.println(c+" "+b+" "+a);
	    }
	    if(c<a&&a<b)
	    {
	    	System.out.println(c+" "+a+" "+b);
	    }
	    
	}

}