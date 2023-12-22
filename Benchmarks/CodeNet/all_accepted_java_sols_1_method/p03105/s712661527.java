import java.util.Scanner;

public class Main{
  static int A,B,C;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    if(B/A>=C){
      System.out.println(C);
    }
    else{
      System.out.println(B/A);
    }
  }
  
}