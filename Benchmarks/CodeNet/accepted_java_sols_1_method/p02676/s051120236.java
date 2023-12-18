import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k =sc.nextLong();
    String s = sc.next();
    long len = s.length();
    if(len<=k)
      System.out.println(s);
    else{
     for(int i=0;i<k;i++)
       System.out.print(s.charAt(i));
       System.out.print("...");
    }
   
  }
}