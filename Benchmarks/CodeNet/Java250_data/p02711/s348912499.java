import java.util.Scanner;

public class Main{ 
 public static void main(String[] args){
  
   Scanner scan = new Scanner(System.in);
   int input =scan.nextInt();
   
   int a=input%10;
   int b=input%100;
   int c=input/100;
   int i=0;
   if(a==7){
     i++;
   }else if(70<=b && b<80){
     i++;
   }else if(c==7){
     i++;
   }
   
   if(i==1){
  System.out.println("Yes\n");
   }
   else{
     System.out.println("No\n");
   }
     
 }
}