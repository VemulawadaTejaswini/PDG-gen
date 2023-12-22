import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    while(input.hasNext()){
      int A = input.nextInt();
      int B = input.nextInt();

      System.out.println(Math.max(A + B, Math.max(A - B, A * B)));
    }
  }
}