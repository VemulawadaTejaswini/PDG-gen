import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    
    int v = sc.nextInt();//Vertical
    
    int h = sc.nextInt();//horizontal
    
    int a = v * h ;//area
    
    int l = 2 * ( v + h );//Lap
    
    System.out.println(a + " " + l);
   }
   
 }

