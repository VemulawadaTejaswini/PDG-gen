import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String a = sc.next();
    //char[] a = sc.nextLine().toCharArray();
    if(a.equals("Sunny")){
      System.out.println("Cloudy");
    }
    else if(a.equals("Cloudy")){
      System.out.println("Rainy");
    }
    else{
      System.out.println("Sunny");
    }
  }
}