import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0) break;

      int maxScore = 0;
      int minScore = Integer.MAX_VALUE;

      for(int i = 0; i < n; i++){
        int sumScore = 0;

        for(int j = 0; j < 5; j++){
          int score = sc.nextInt();
          sumScore += score;
        }

        maxScore = Math.max(maxScore, sumScore);
        minScore = Math.min(minScore, sumScore);
      }

      System.out.println(maxScore + " " + minScore);
    }
  }
}