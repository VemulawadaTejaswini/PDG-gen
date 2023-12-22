import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = sc.next();
    
    int harfOfN = n / 2;
    String firstOfS = s.substring(0, harfOfN);
    String lastOfS = s.substring(harfOfN + 1 -1);
    
    if (firstOfS.equals(lastOfS)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}