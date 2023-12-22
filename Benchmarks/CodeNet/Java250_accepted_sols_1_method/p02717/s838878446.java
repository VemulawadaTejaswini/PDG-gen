import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
    String X = sc.next();
    String Y = sc.next();
    String Z = sc.next();
    list.add(X);
    list.add(Y);
    list.add(0, Z);
    for(String i : list){
      System.out.print(i + " ");
    }
  }
}
      
