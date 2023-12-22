import java.util.*;
public class Main  
{ 
    static boolean isPalindrome(String str)
    {
      	StringBuilder sb = new StringBuilder(str);
      	String st = sb.reverse().toString();
      	return st.equals(str);
    }  
    public static void main(String[] args) 
    { 
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        int N = str.length();
      	String s = str + " ";
      	int q =(N-1)/2 , p = (N+3)/2;
        if(isPalindrome(str) && isPalindrome(str.substring(0,q)) && isPalindrome(s.substring(p-1,str.length())))
        {
          	System.out.println("Yes");
        }
      else
      {
        System.out.println("No");
      }
    } 
} 