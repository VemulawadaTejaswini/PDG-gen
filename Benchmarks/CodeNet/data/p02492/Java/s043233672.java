import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b, res;
    String op;
    while (true) {
      a  = sc.nextInt();
      op = sc.next();
      b  = sc.nextInt();
      if (op.equals(+)) {
        res = a+b;
      }
      else if (op.equals(-)) {
        res = a-b;
      }
      else if (op.equals(*)) {
        res = a*b;
      }
      else if (op.equals(/)) {
        res = a/b;
      }
      else {
        break;
      }
      System.out.println(res);
    }
  }
}