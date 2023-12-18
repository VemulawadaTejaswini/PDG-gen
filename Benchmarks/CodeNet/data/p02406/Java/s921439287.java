import java.util.Scanner;
public class Main {
 private static Scanner sc;
 public static void main(String[] args){
  int i;
  sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println();
   for(i=3;i<=n;i++){
	   if(n<3||n>10000){
		   break;
	   }
    if(i%3==0 || i%10-3==0){
     System.out.print(" "+i);
    } 
    else{
     if(i%10==3){
      System.out.print(" "+i);
     }
    }
   }
 }
}