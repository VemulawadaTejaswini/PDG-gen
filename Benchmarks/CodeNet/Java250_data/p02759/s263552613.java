import java.util.Scanner;

public class Main{

  public static void main(String[] ards){
    // Nは整数で受け取るのが前提条件
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    double number = N;
    double print = number / 2 ;

    System.out.println(Math.round(print));
  }


  




}