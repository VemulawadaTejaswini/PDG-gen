import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

     String n = sc.next();
     char c ;
     String s;
     int data = 0;
     for (int i = 0;i<n.length() ;i++ ) {
       c = n.charAt(i);
       s = String.valueOf(c);
       int a =  Integer.parseInt(s);
       data  +=a;
     }

     if(Integer.parseInt(n)%data==0){
       System.out.println("Yes");
     }else{
       System.out.println("No");
     }




      }
    }
