import java.util.Scanner;
public class Main {
	public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      double sum = 0.0;
      for(int i = 0; i < N; i++) {
        int input = sc.nextInt();
        sum += (double) (1 / (double)input);
      }
      sum = 1 / sum;
      System.out.println(sum);
      
    }
}