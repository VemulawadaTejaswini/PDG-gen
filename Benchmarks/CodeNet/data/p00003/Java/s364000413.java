
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       Scanner c = new Scanner (System.in);
       int n=c.nextInt();
       while(n>0){
          int a= c.nextInt();
          int b= c.nextInt();
          int c2= c.nextInt();
          int r=(a*a)+(b*b);
          int r2=c2*c2;
          if(r==r2){
          System.out.println("YES");
          }
          else
              System.out.println("NO");
       n--;
       }
    }

}