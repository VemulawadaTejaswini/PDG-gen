import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
//    String a = sc.next();  // input String
    int d=0;
    for (int i=1; i<=4; i++){
      d=sc.nextInt();
    }
    int k=sc.nextInt();
    if (d-a>k){
      System.out.println(":(");
    } else {
      System.out.println("Yay!");
    }
  }
}
