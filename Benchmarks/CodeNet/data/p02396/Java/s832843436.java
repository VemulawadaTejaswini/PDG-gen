import static java.lang.System.out;
 public class Main {
     public static void main(String...args){
         int i = 1;
         while(true){
             int Number = new java.util.Scanner(System.in).nextInt();
             out.println ("Case" + i + ":" + Number);
             i++;
             if(Number == 0){
                 break;
             }
 
         }
     }
 }            