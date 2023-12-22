import java.util.Scanner;
 
public class Main {
  public static void main (String[] args){
    
   String a,b,c; 
 
   Scanner sc = new Scanner (System.in);
   a=sc.nextLine();
   b=sc.nextLine();
   c=sc.nextLine();

   String new_a = a.substring(0,1);
   String new_b = b.substring(1,2);
   String new_c = c.substring(2,3);

   System.out.print(new_a);
   System.out.print(new_b);
   System.out.println(new_c);
  }
}