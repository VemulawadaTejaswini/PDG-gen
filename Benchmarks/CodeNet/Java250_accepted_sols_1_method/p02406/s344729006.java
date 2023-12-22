import java.util.Scanner;
  
public class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   int i = 1;      
    while(i <= n){
     if(i % 3 == 0){
      System.out.print(" " + i);
     }else{
      int Check=i;          
       while(Check > 0){
        if(Check % 10 == 3){
         System.out.print(" " + i);
         break;
        }
       Check = Check / 10;
       }
     }
      i++;
    }
     System.out.println();
 }
}