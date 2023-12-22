import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // a
    int limit = Integer.parseInt(sc.next());
    // b
    int container1 = Integer.parseInt(sc.next());
    // c
    int container2 = Integer.parseInt(sc.next());

    int residual = container1 + container2 - limit;
    int result = residual < 0 ? 0 : residual; 
    System.out.print(result);
  }
}