import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   String s=sc.next();
	   char prev=s.charAt(0);int count=0;
	   for(int i=1;i<s.length();i++)
	   {
	       if(s.charAt(i)!=prev)
	       {
	           count++;
	           prev=s.charAt(i);
	       }
	   }
	   System.out.println(count);}}