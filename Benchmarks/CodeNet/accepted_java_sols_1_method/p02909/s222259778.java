import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final String S=sc.next();
    switch(S){
      case "Sunny":
        System.out.println("Cloudy");
        break;
      case "Cloudy":
        System.out.println("Rainy");
        break;
      case "Rainy":
        System.out.println("Sunny");
    }
  }
}