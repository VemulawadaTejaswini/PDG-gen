import java.util.Scanner;

public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int S=sc.nextInt();
      int a=S%10;
      int b=S%100;
      int c=S%1000;
      
      if ((S-c)/1000==(c-b)/100){
      	System.out.println("Bad");
      }else if((c-b)/100==(b-a)/10){
      	System.out.println("Bad");
      }else if((b-a)/10==a){
      	System.out.println("Bad");
      }else{
        System.out.println("Good");
      }
      
    
    
    
    
    }
}