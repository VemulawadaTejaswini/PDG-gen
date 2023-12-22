import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] xs = new int[n];
    int[] ys = new int[m];
    for(int i = 0; i < n; i++){
      xs[i] = sc.nextInt();
    }
    for(int i = 0; i < m; i++){
      ys[i] = sc.nextInt();
    }
    
    Arrays.sort(xs);
    Arrays.sort(ys);
    if(xs[n-1] < ys[0] && xs[n-1] < y && ys[0] > x){
      System.out.println("No War");
    }else{
      System.out.println("War");
    }
  }
}