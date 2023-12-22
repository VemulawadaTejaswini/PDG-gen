import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] x = new int[11];
    int r = sc.nextInt();
    int d = sc.nextInt();
    x[0] = sc.nextInt();

    for(int i=0; i<10; i++){
      x[i+1] = r * x[i] - d;
      System.out.println(x[i+1]);
    }
  }
}