import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int pro = A*B;

    if(pro%2 == 0) {
      System.out.println("Even");
    }else {
      System.out.println("Odd");
    }
  }
}
