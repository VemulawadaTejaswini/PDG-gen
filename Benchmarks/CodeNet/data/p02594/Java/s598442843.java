import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int x = sc.nextInt();

    //output
    if( x >= 30 ){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }    

  }
}
