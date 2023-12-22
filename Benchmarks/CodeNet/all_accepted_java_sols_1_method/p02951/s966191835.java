import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int D = A - B;

    int E = C - D;

    if(E < 0){
      E = 0;
    }
    System.out.println(E);
    
  }
}