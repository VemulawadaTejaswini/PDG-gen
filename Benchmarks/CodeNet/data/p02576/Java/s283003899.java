import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int N = in.nextInt(), X = in.nextInt(), T = in.nextInt();
    if(N % X !=0){
      System.out.println((N / X + 1) * T);
    }else{
      System.out.println(N / X * T);
  }
}