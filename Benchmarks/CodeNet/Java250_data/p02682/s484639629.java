import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
      int score = 0;
      while(K > 0){
        if(A > 0){
          A--;
          K--;
          score++;
        }
        else if(B > 0){
          B--;
          K--;
        }
        else if(C > 0){
          C--;
          K--;
          score--;
        }
      }
      System.out.println(score);
	
	}
}