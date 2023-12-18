import java.util.Scanner;

public class Main {
  static long MAX_ANSWER = 1000000000000000000l;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] input = new long[n];
    for(int i = 0; i < n; i++){
      long l = sc.nextLong();
      if(l == 0l){
        System.out.print(0);
        return;
      }
      input[i] = l;
    }
    long answer = 1;
    for(long l : input){
      if(Math.abs(MAX_ANSWER / l) < answer){
        System.out.print(-1);
        return;
      }
      answer *= l;
    }
    System.out.print(answer);
  }
}