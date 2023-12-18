import java.util.*;


public class Main {
  public static void main(String[] srgs) {

    while(true){

      Scanner scanner = new Scanner(System.in);
      System.out.print("Input numeric value > ");
      Integer x = scanner.nextInt();
      if ( (x>=1)&&(x<=100) ) {
        double result = Math.pow(x,3);
        System.out.println("computated value=" + result);
      } else {
        break;
      }

    }

  }
}