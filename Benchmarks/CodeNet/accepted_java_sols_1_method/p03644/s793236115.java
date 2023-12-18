import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    int ans = 1;

    for(int i=1; i<N+1; i++) {
      int challengeNum = i;
      int challengeCount = 0;
      while(challengeNum % 2 == 0){
        challengeCount++;
        challengeNum /= 2;
      }
      if(count < challengeCount) {
        count = challengeCount;
        ans = i;
      }
    }

    System.out.println(ans);
  }
}
