import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      String[] a = sc.next().split("");

      int sum = 0;
      for(String i: a){
        sum += Integer.parseInt(i);
      }
      System.out.println(sum);
      sc.close();
    }
    
}
