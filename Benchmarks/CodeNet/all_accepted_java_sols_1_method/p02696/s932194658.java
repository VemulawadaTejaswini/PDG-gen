import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    long b=sc.nextLong(),n=sc.nextLong(),max=0;
    long f=0;
    if(a<b) {
	    if(n>=b-1) {
	    	System.out.println(a-1);
	    }else {
		    System.out.println((a*n)/b-a*(n/b));
	    }
    }else {
	    if(n>=b-1) {
	    	System.out.println(a-(long)Math.ceil(a*1.0/b));
	    }else {
	    	 System.out.println((a*n)/b-a*(n/b));
	    }
    }
  }
}
