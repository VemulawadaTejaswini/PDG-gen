import static java.lang.System.out;                                                                                                        
public class Main {
     public static void main(String[] args){
         String str = new java.util.Scanner(System.in).nextLine();
         String[] tmp = str.split(" ");
         int a = Integer.parseInt(tmp[0]);
         int b = Integer.parseInt(tmp[1]);
 
         if (a < b){
             out.println("a < b");
         }         
         else if(a > b){
             out.println("a > b");
         }
         else {
             out.println("a == b");
         }
 
     }
}