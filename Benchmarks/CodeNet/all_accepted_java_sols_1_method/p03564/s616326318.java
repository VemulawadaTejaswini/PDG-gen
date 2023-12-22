import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    int N = stdIn.nextInt();
    int K = stdIn.nextInt();

    int number = 1;

    for(int i=1; i<=N; i++){
      if(number*2 < number+K){
        number = number*2;
      }
      else{
        number = number+K;
      }

    }
    System.out.println(number);
  }
}
