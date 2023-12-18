import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	while(true){
	    String c = stdIn.next();
	    if(c.equals("-"))
		break;
	    
	    int m = stdIn.nextInt();
	    for(int i=0;i<m;i++){
		int h = stdIn.nextInt();
		String t=c.substring(0,h);
		c=c.substring(h,c.length())+t;
	    }
	    System.out.println(c);
	}
    }
}