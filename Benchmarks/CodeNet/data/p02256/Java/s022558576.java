import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int r = 0;
    if(a<=b){
      swap(a, b);
    }
    while(b > 0){
      r = a % b;
      a = b;
      b = r;
    }
    System.out.println(a);
  }
  private static void swap(int x, int y){
    int z;
    z = x;
    x = y;
    y = z;
  }
}
