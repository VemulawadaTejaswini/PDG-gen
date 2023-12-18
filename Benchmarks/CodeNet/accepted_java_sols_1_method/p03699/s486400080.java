import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] scores = new int[n];

      int sum = 0;
      for(int i = 0; i < n; i++) {
        scores[i] = sc.nextInt();
        sum += scores[i];
      }
      if(sum % 10 == 0) {
        Arrays.sort(scores);
        int i = 0;
        for(; i < n; i++) {
          if(scores[i] % 10 != 0)
            break;
        }
        if(i == n) {
          System.out.println(0);
        } else {
          System.out.println(sum - scores[i]);
        }
        return;
      }
      System.out.println(sum);
  }

}
