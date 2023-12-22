import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int i;
  for(i = 1;i <= n;i++){
   if (i%3 == 0) {
    System.out.printf(" " + i);
   }else if(i%10 == 3){
      System.out.printf(" " + i);
   }else{ 
    int x = i;
    while(x > 10){
     x= x/10;
     if(x%10 == 3){
      System.out.printf(" " + i);
      break;
     }
    }
   }
  }
 System.out.println("");
 }
}