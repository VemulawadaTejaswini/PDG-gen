import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  while (true) {
   int n = sc.nextInt();
   int i;
   int x = i;
   for(i = 1;i <= n;i++){
    if (x%3 == 0) {
     System.out.printf(" " + i);
    }else if(x%10 == 3){
     System.out.printf(" " + i);
    }
   }
   System.out.ptintf("\n");
  }
 }
}