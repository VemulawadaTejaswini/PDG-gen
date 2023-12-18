import java.util.*;
public class Main{
 
    public static void main(String[] args)
          {
	Scanner sc=new Scanner(System.in);
      String str =sc.next();
      String str1 =sc.next();
      int count=0;
	  
        for(int i=0;i<str.length();i++){
          if(str.charAt(i)!=str1.charAt(i)){
          count++;
          }
        }
      
      System.out.println(count);
    }
}