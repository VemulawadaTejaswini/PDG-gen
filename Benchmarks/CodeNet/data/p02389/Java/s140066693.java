import java.util.Scanner;

public class Main{

public static void main(String[] args){
Scanner scan = new Scanner(System.in);
  int a = scan.nextInt();
  int b = scan.nextInt();

  System.out.printf("%d %d", area(a, b), length(a, b));
}

public static int area(int a, int b){
  return a * b;
}

public static int length(int a, int b){
  return (a + b) * 2;
}
}