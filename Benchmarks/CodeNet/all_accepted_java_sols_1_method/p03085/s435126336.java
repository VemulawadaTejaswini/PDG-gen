import java.util.Scanner;

public class Main{
  static char str;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    str = sc.next().charAt(0);
    if('A'==str){
      System.out.println("T");
    }
    else if('T'==str){
		System.out.println("A");
    }
    else if('G'==str){
      System.out.println("C");
    }
    else if('C'==str){
      System.out.println("G");
    }
    else{
      System.out.println("No");
    }
  }
}
