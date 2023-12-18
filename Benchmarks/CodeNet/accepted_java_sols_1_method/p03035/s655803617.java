import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int B = sc.nextInt();

    if(N >= 13){
      System.out.println(B);
    }else if((N <= 12) && (N >= 6)){
      System.out.println(B / 2);
    }else if(N <= 5){
      System.out.println(0);
    }

  }
}