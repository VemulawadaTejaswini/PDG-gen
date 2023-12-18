import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	String a=stdIn.next();
	String b=stdIn.next();
	String c=stdIn.next();
	String A=a.substring(0,1).toUpperCase();
	String B=b.substring(0,1).toUpperCase();
	String C=c.substring(0,1).toUpperCase();
	System.out.println(A+B+C);
    }
}
