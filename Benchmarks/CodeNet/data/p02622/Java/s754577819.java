import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s= scanner.nextLine();
    String t= scanner.nextLine();

    int ans = 0;
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i)!= t.charAt(i)){
        ans += 1;
      }
    }
    System.out.println(ans);
    
    scanner.close();
    return;
  }
}
