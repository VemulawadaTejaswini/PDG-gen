import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int a = sc.nextInt();

    //output
    int output = (int)(a+Math.pow(a,2)+Math.pow(a,3));
    System.out.println(output);

  }
}
