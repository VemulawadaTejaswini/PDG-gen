
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     if(n%4==0 || n%7==0){
         System.out.println("Yes");
         return;
     }
     else{
     for(int i=4;i<=n;i+=4){
      for(int j=i+7;j<=n;j+=7){
      if(j==n){    
      System.out.println("Yes");
      return;
      } 
      }
     }
     
     }
    
    System.out.println("No");
    }
}
