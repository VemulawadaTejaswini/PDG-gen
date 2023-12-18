import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
       int a,b,c;
       Scanner scan = new Scanner(System.in);
        
       a = scan.nextInt();
       b = scan.nextInt();
       c = scan.nextInt();
       if(a<b && b<c){
        System.out.print("Yes");
       }else{
        System.out.print("No");
       }
   }
 
}