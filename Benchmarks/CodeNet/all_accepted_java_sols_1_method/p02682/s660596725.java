import java.util.Scanner;

public class Main {
	public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int K = sc.nextInt();
      int score = 0;
      if (K < A) {
        score = K;
      } else if(K <= A + B) {
        score = A;
      } else {
        score = A - (K - A - B); 
      }
      System.out.println(score);
    }
}