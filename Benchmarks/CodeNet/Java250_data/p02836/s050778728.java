import java.util.*;
public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String S = sc.next();
    int N = S.length();
   int count =0;
     for(int i =0;i<N/2;i++)
     {
        if(S.substring(i,i+1).equals(S.substring(N-i-1,N-i)));
		else count++;    
     }
        	System.out.println(count);
 }
}