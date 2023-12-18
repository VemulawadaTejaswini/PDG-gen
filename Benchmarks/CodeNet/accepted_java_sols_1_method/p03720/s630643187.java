import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Map<Integer,Integer> count = new HashMap<Integer,Integer>();
    for(int i = 1; i <= n; i++){
      count.put(i,0);
    }
    for(int i = 0; i < m; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int temp = count.get(a) + 1;
      count.put(a,temp);
      temp = count.get(b) + 1;
      count.put(b,temp);
    }
    for(int i = 1; i <= n; i++){
      System.out.println(count.get(i));
    }
  }
}