import java.util.*;
class Main
{
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String s =  scan.next();
    int max = 0 ;
   	for(int i = 0 ; i<s.length()-2 ; i++){
      int a = Integer.parseInt(s.substring(i,i+3));
     // System.out.println(a);
      if(Math.abs(753-a) < Math.abs(753-max) ){
        max = a ;
      }
    }
    System.out.println(Math.abs(753-max));
    
  }
}
