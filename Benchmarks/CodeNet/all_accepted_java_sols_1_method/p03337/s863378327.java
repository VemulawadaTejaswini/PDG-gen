import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int result = 0;
    result = Math.max(A + B, A - B);
    result = Math.max(result , A * B);
    System.out.println(result);
  }
}
