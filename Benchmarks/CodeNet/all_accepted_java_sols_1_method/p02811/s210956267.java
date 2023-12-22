import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K,X;
    K=sc.nextInt();
    X=sc.nextInt();
    if(500*K>=X){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    sc.close();
  }
}