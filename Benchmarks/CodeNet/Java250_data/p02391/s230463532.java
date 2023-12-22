import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.nextLine();
      String[] max = a.split(" ");
     
      String b1 = max[0];
      String b2 = max[1];
      int a1 = Integer.parseInt(max[0]);
      int a2 = Integer.parseInt(max[1]);
      if (a1 == a2){
          System.out.println("a == b");
      }else if (a1 < a2){
          System.out.println("a < b");
      }else if (a1 > a2){
          System.out.println("a > b");
    }
  }
}