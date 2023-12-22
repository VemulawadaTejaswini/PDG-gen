import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int answer = -1;
    for(int i = 0;i < 10000;i++){
      int x1 = (int)(i * 0.08);
      int x2 = (int)(i * 0.1);
      if(x1 == A){
        if(x2 == B){
          answer = i;
          break;
        }
      }
    }
    System.out.println(answer);
  }
}