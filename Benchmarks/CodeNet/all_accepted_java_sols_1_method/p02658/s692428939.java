import java.util.Scanner;

public class Main {
  static final long MAX_NUMBER = 1000000000000000000L;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long answer = 1l;
    int n = sc.nextInt();
    long[] values = new long[n];
    for(int i = 0; i < n; i++) {
      values[i] = sc.nextLong();
      if(values[i] == 0){
        System.out.println(0);
        return;
      }
    }
    for(int i = 0; i < n; i++) {
      long tmp = values[i];
      if(MAX_NUMBER / tmp < answer){
        System.out.println(-1);
        return;
      } else {
        answer *= tmp;
      }
    }
    System.out.println(answer);
  }
}