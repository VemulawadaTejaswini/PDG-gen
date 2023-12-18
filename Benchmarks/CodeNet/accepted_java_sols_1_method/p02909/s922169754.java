//ABC141 A
import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String S;
    S=sc.nextLine();
    String s="Sunny";
    String c="Cloudy";
    String r="Rainy";

    if(S.equals(s)){
      System.out.println("Cloudy");
    }else if(S.equals(c)){
      System.out.println("Rainy");
    }else{
      System.out.println("Sunny");
    }

  }
}
