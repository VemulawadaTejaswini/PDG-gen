import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    int min = -1;
    ArrayList<Integer> a = new ArrayList<Integer>();
    for (int i=0; i<n;i++){
      int b = scan.nextInt();
      int [] g = put(b,min);
      sum += g[0];
      min = g[1];
    }
    System.out.println(sum);
  }

  public static int[] put(int a, int b){
    int [] g = new int[2];
    if (b == -1){
      g[1] = a;
      g[0] = 1;
      return g;
    }

    if (a <= b){
      g[1] = a;
      g[0] = 1;
      return g;
    }

    g[1] = b;
    g[0] = 0;
    return g;
  }
}
