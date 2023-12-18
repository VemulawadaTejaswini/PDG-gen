import java.util.Scanner;
import java.util.Arrays;

class Max{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.nextLine();
      String[] max = a.split(" ");
     
      String b1 = max[0];
      String b2 = max[1];
      int a1 = Integer.parseInt(max[0]);
      int a2 = Integer.parseInt(max[1]);
      System.out.println(Math.max(a1, a2));
    }
}