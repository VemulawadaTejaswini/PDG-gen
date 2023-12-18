import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    String input1 = sc.next();
    char input = input1.charAt(0);

    //output
    if( Character.isUpperCase(input) ){
      System.out.println("A");
    }else{
      System.out.println("a");
    }

  }
}
