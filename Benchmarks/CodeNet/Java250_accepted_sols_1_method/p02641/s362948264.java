import java.util.*;
import java.io.*;
public class Main {
       public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           int  x =  sc.nextInt();
           int  y =  sc.nextInt();
           if(y == 0)  {
               System.out.println(x);
           }
           else {
               HashSet<Integer> hs = new HashSet<Integer>();
               for(int i = 0; i < y; i++) {
                    hs.add(sc.nextInt());
               }
               if(hs.contains(x) == false) 
                              System.out.println(x);
               else {
                               for(int i = 1; i <= 100; i++) {
                        
                          if(hs.contains(x-i) == false) {
                                     System.out.println(x-i);
                                     break;
                          }
                          if(hs.contains(x+i) == false) {
                                     System.out.println(x+i); 
                                     break;
                          }
               }
}
           }
       }
}