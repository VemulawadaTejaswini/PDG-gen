import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int answer = 0;
    int[] array = new int[N + 1];
    for(int i = 1; i <= N; i++){
      array[i] = sc.nextInt();
    }
    for(int i = 1; i <= N; i++){
      if(i %2 == 1 && array[i] % 2 == 1){
        answer++;
      }
    }
    System.out.println(answer);
  }
}