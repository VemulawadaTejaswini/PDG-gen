import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    if(N.equals("Sunny")){
    	System.out.println("Cloudy");
    }else if(N.equals("Cloudy")){
    	System.out.println("Rainy");
    }else{
    	System.out.println("Sunny");
    }
  }
}