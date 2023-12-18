import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int vec[];
    vec = new int[n];
    for (int i = 0; i < n; i++){
      vec[i] = scan.nextInt();
    }
    int ans = 0;
    Arrays.sort(vec);
    for (int i = 0; i < k; i++){
      ans = ans + vec[i];
    }
    System.out.println(ans);
  }
}
    