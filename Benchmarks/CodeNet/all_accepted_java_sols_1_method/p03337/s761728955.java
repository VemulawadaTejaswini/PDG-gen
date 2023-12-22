import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int asm[] = new int [3];
    asm[0] = a + b;
    asm[1] = a - b;
    asm[2] = a * b;
    Arrays.sort(asm);
    System.out.println(asm[2]);
  }
}