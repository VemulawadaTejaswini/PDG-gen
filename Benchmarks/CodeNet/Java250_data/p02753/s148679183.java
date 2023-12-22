
import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String ss=s.next();
		int c=1;
		for(int i=1;i<ss.length();i++){
		    if(ss.charAt(i)!=ss.charAt(i-1))
		    c++;
		}
		if(c>1)
		System.out.println("Yes");
		else
		System.out.println("No");
	    
	}
}