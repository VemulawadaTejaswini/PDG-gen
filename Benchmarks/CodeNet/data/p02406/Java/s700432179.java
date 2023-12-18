import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
  Scanner num = new Scanner(System.in);
  int n = num.nextInt();
  int i=1;
  
  while(true){
   
   String three = "" + i;
   int x=i;
   if(x%3 == 0 || three.contains("3")){
    System.out.printf(" %d",i);
   }
   i++;
   if(i > n) break;
  }
  
  System.out.println();
 }
}