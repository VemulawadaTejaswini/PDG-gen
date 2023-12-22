import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x  = Integer.parseInt(sc.next());
    int[] a = new int[x];
    for(int i = 0; i < x; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    for(int i = x - 1; i > 0 ; i--){
      System.out.printf("%d ", a[i]);
    }
    System.out.printf("%d\n", a[0]);
  }
}
