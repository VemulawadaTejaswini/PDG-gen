import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long l=sc.nextLong();
	   
		String ans="";
	    while(l-->0) {
	    	ans=(char)('a'+(l%26))+ans;
	    	l/=26;
	    }
	   
		System.out.println(ans);
	}
}
