import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    int R = stdIn.nextInt();
    int G = stdIn.nextInt();

    int answer = 2 * G - R;

    System.out.println(answer);



  }

}
