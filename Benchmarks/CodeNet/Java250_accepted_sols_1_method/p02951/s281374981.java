import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int array[] = new int[3];
      array[0] = sc.nextInt();
      array[1] = sc.nextInt();
      array[2] = sc.nextInt();
      int x;

      x = array[0] - array[1] - array[2];
      if(x < 0){
        x = Math.abs(x);
      } else {
        x = 0;
      }
      System.out.println(x);
    }
}
