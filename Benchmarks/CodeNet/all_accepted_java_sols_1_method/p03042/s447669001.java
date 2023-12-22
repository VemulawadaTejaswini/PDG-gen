import java.util.Scanner;
//2-3
public class Main{
    public static void main(String [] args){
    	Scanner scan=new Scanner(System.in);
    	String s=scan.next();
    	StringBuilder sb = new StringBuilder(s);
    	int a=Integer.parseInt(sb.substring(0, 2));
    	int b=Integer.parseInt(sb.substring(2,4));

    	boolean c=false;
    	boolean d=false;
    	//System.out.println(a+" "+b);
    	if(a<=12 && a>0) {
    		c=true;
    	}
    	if(b<=12 && b>0) {
    		d=true;
    	}

    	if(c&&d) {
    		System.out.println("AMBIGUOUS");
    	}else if(c) {
    		System.out.println("MMYY");
    	}else if(d) {
    		System.out.println("YYMM");
    	}else {
    		System.out.println("NA");
    	}
    }
}