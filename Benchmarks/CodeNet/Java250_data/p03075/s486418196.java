import java.util.*;
public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] a = new int[5];

    for (int i = 0; i < 5; i++) {
      a[i] = sc.nextInt();
    }
    
    int k = sc.nextInt();
    
    String result = ant(a, k);
      
    // 出力
    System.out.println(result);
  }
  
  private static String ant(int[] a, int k) {
    
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] - a[i] > k) {
          return ":(";
        }
      }
    }
    return "Yay!";
  }
}