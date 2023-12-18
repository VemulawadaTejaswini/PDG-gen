import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  double a = scan.nextInt();
  char op = scan.next().charAt(0);
  double b = scan.nextInt();

  if (op == '?'){
  } else if (op == '+'){
    System.out.println(a + b);
  } else  if (op == '-'){
    System.out.println(a - b);
  } else  if (op == '*'){
    System.out.println(a * b);
  } else  if (op == '/'){
    System.out.println(a / b);
  }
  }
}