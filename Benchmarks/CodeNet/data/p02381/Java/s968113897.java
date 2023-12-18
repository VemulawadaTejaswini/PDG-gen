import java.util.*;

public class Main{
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) { while (true) {
      int n = sc.nextInt();
      if (n == 0) { break; }
      double average = 0, variance = 0;
      int[] scores = new int[n];
      for (int i = 0; i < scores.length; i++) {
      scores[i] = sc.nextInt();
        average += scores[i];
       }

       average = average/ (double)scores.length;
      
      for(int i = 0;i<scores.length;i++){
        variance += (average - (double)scores[i])*(average - (double)scores[i]);
      }
      variance  = variance/ (double)scores.length;
      System.out.println(Math.sqrt(variance));
        }
      }
  }
}
