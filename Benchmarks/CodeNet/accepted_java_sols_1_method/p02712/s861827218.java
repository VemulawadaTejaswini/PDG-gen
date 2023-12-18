import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long answer = 0;
    long n = sc.nextLong();
    long i = 0;
    while(i < n){
      i++;
      if(i % 3 == 0 || i % 5 == 0) continue;
      answer += i;
    }
    System.out.println(answer);
  }
}