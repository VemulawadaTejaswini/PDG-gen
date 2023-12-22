import java.util.Scanner;
import java.util.HashMap;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N + 10];
    int ans = 0;
    for (int i = 0; i < N; i++){
      a[i] = scanner.nextInt();
    }
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < N; i++){
      if (!map.containsKey(a[i])){
        map.put(a[i], 1);
      } else {
        map.put(a[i], map.get(a[i]) + 1);
      }
    }
    for (int key : map.keySet()) {
      if(key <= map.get(key)){
        ans += map.get(key) - key;
      } else {
        ans += map.get(key);
      }
    }
    System.out.println(ans);
  }
}
