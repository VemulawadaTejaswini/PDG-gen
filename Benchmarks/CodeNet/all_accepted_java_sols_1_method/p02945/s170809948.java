import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int A=sc.nextInt();
    final int B=sc.nextInt();
    int[] result={A+B,A-B,A*B};
    Arrays.sort(result);
    System.out.println(result[2]);
  }
}