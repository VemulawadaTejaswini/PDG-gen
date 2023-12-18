import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String A = sc.nextLine();
      String[] max = A.split(" ");
      

      int a = Integer.parseInt(max[0]);
      int b = Integer.parseInt(max[1]);
      int c = Integer.parseInt(max[2]);

      if (a < b && b < c){
        System.out.println("Yes");
      }else 
        System.out.println("No");
  }
}