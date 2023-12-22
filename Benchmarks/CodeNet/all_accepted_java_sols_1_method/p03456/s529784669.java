import java.util.*;
 class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      String m = Integer.toString(scan.nextInt()) ;
      String n = Integer.toString(scan.nextInt()) ;
      int x = Integer.parseInt(m+n) ;
      
      if((Math.sqrt(x) - (int)Math.sqrt(x)) == 0){
          System.out.println("Yes");
      }else{
          System.out.println("No");
      }
      
    }
}