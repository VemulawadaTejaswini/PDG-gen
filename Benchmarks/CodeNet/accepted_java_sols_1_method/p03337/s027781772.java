import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int x = A + B;
    int y = A - B;
    int z = A * B;

    int sum = Math.max(x,y);
    sum = Math.max(sum,z);

    System.out.println(sum);

  }
}