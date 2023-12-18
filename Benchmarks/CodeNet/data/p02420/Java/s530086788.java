
import java.util.*;
class Main {
    public static void main(String...args) {
       Scanner scan = new Scanner(System.in);
       String str = null;
       int total =0;
       while(true) {
           str = scan.next();
           if(str.equals("-"))break;
           int times = scan.nextInt();
           for(int i = 0 ; i < times; i++) {
               total += scan.nextInt();
           }
           for(int n = 0; n < str.length(); n++) {
               System.out.print(str.charAt((total + n )%str.length()));
           } 
           System.out.println();
           total = 0;
       }
    
    }
}


