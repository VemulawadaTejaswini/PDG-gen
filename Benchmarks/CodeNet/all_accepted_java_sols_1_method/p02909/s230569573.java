import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    List<String> w = new ArrayList<String>();
    w.add("Sunny");
    w.add("Cloudy");
    w.add("Rainy");
    w.add("Sunny");
    System.out.println(w.get(w.indexOf(s)+1));
  }
}
