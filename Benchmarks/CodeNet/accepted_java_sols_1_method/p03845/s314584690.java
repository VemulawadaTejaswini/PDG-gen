import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] t = new int[sc.nextInt()];
    int sum = 0;
    for(int i = 0; i < t.length; i++){
      t[i] = sc.nextInt();
      sum += t[i];
    }
    int[] P = new int[sc.nextInt()];
    int[] X = new int[P.length];
    for(int i = 0; i < P.length; i++){
      System.out.println(sum - t[sc.nextInt()-1] + sc.nextInt());
    }
  }
}