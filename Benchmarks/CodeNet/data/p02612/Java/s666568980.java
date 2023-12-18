import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();

    //output
    int cost = n%1000;
    if( cost == 0 ){
      System.out.println(0);
    }else{
      System.out.println(1000-cost);
    }

  }
}
