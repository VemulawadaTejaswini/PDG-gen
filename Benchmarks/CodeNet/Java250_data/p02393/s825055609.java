import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int n;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
 
        if(a<b){
            n = a;
            a = b;
            b = n;
          }
        
          if(b<c){
            n = b;
            b = c;
            c = n;
          }
        
          if(a<b){
            n = a;
            a = b;
            b = n;
          }

          System.out.println(""+c+" "+b+" "+a);
    }
}
