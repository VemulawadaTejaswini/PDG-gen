import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int t = 1;
  for (int i = 1; ; i++) {
   int x = sc.nextInt();
   if(x != 0){
    System.out.println("Case " + t + ": " + x);
   }else{
    break;
   }
   t++;
  }
 }
}