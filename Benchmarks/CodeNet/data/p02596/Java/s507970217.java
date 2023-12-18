import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int sevens = 1;
    if (K%2==0 || K%5==0) {
      System.out.println(-1);
    } else {
      shori:{
      for (int i=1; i<1e6; i++){
         if (sevens*7%K==0){
           System.out.println(i);
           break shori;
         } else {
           sevens=sevens+(int)Math.pow(10,i);
         }
      }
      System.out.println(-1);
      }
    }
  }
}