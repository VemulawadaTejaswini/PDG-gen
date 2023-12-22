import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String o="";
       int k=sc.nextInt();
       int x=sc.nextInt();
      if(500*k>=x)o="Yes";
      else o="No";
      System.out.println(o);
    }
}