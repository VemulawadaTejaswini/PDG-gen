// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    String s = input.next();
	    String[] str = s.split("ABC");
	    int sum = 0;
	    for(int i=0;i<str.length;i++)
	        sum+=str[i].length();
	    System.out.println((n-sum)/3);
	}
}