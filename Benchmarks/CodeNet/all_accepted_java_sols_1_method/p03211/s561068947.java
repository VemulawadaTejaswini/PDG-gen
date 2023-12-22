import java.util.*;
public class Main{
  public static void main(String[] args){
   	Scanner sc = new Scanner(System.in);
	String S = sc.next();
    int N = S.length();
    int min = 753;
   	for(int i = 0;i<N-2;i++)
   {
	    if(Math.abs(753-Integer.valueOf(S.substring(i,i+3)))<min) min = Math.abs(753-Integer.valueOf(S.substring(i,i+3)));
   }
   	System.out.println(min);
 }
}