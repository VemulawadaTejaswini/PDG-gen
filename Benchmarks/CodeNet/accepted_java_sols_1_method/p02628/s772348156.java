import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] value = new int [N];
        for(int i = 0; i< N; i++) value[i] = sc.nextInt();
       Arrays.sort(value);
      int ans = 0;
      for(int i = 0; i < K; i++) ans += value[i];
      System.out.println(ans);
    } 
}