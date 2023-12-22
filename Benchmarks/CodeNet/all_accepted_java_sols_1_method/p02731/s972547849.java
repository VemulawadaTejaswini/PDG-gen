import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    float h = (float)L/3;
    System.out.println(h*h*h);
  }
}