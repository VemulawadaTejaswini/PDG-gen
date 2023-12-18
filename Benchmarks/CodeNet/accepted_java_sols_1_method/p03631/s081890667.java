
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String[] N = sc.next().split("");

      if (N[0].equals(N[2])){
      System.out.println("Yes") ;
      }
      else {
      System.out.println("No") ;
      }
  }
}
