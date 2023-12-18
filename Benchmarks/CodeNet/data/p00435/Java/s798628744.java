import java.util.*;

public class Main{
		   public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
           String s=sc.next();
			   char[] ca = s.toCharArray();
		   for(int i=0;i<s.length();i++)ca[i]-=3;
		   System.out.println(String.valueOf(ca));
	      }
		}