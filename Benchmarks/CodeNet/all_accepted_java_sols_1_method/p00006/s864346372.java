import java.util.Scanner;


public class Main {
	public static void main(String args[])
	   {
	      String x,y;
	      x="";
	      y="";
	      Scanner in = new Scanner(System.in);
	      x = in.nextLine();
	 
	      int l = x.length();
	 
	      for ( int i = l - 1 ; i >= 0 ; i-- )
	         y = y + x.charAt(i);
	 
	      System.out.println(y);
	   }}