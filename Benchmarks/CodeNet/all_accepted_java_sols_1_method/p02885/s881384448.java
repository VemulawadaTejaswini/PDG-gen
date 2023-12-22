import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      
      int result = 0;
      result = a - b*2;
      if (result >= 0) {
      System.out.println(result);
      }
      else {
      System.out.println(0); 
      }
    }
}