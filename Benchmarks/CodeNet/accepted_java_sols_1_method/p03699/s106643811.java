import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int numProblems = Integer.parseInt(br.readLine());
    int sum = 0;
    int minimumScoreProblem = 101;
    int tempScore = 0;
    
    for (int i=0; i<numProblems; i++){
      tempScore = Integer.parseInt(br.readLine());
      sum += tempScore;
      if(minimumScoreProblem>tempScore && tempScore%10 != 0){
        minimumScoreProblem = tempScore;
      }
    }
    int maxPoint;
    if (sum%10 != 0){
      maxPoint = sum;
    } else if (minimumScoreProblem == 101){
      maxPoint = 0;
    } else {
      maxPoint = sum - minimumScoreProblem;
    }
    System.out.println(maxPoint);
  }
}
