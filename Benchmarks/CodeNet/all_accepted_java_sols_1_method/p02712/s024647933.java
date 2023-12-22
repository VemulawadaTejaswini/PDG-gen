import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long sum = 0;
    for(long i = 1;i < N + 1;i++){
      if(!(i % 3 == 0 || i % 5 == 0)){
        sum = sum + i;
      }
    }
    System.out.println(sum);
  }
}