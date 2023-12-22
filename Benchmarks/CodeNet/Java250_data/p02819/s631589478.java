import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    boolean flag = true;

    while(flag){
      if(X==2){
      break;
      }
      for(int i=2; i<X; i++) {
        flag = false;
        if(X % i == 0){
          X++;
          flag = true;
          break;
        }
      }
    }
    System.out.println(X);
  }
}