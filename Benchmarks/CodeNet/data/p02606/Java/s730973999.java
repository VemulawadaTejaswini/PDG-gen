import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();  // input Integer
    int c = sc.nextInt();  // input Integer
    
    int count=0;
    for (int i = a; i<=b; i++){
      if (i%c==0){
        count++;
      }
    }
    System.out.println(count);

    //    String a = sc.next();  // input String
  }
}