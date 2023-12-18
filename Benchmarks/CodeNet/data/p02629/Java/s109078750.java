import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    
    String name = "";
    
    while(true){
      String x = Character.toString((char)(N-1)%26+97);
      name = x.concat(name);
      if(N >26){
        N = (long)N/26;
      } else {
        break;
      }
    }
    System.out.println(name);
  }
}