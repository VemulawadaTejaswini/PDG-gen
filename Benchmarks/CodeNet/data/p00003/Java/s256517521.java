import java.util.*;

public class Main {

  public static int squareNumber(int x) {
    return x * x;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numOfTriangles = in.nextInt();
    for (int i = 0; i < numOfTriangles; i++) {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();

      System.out.println(a);

      int[] squares = {squareNumber(a), squareNumber(b), squareNumber(c)}; 

      if (squares[0] + squares[1] == squares[2]) {
        System.out.println("YES");
      } else if(squares[1] + squares[2] == squares[0]) {
        System.out.println("YES");
      } else if(squares[0] + squares[2] == squares[1]) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }   
    }   
  }
}