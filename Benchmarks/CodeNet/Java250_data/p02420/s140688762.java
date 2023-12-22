import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      String s = sc.next();
      if(s.equals("-")){
        break;
      }
      int m = Integer.parseInt(sc.next());
      for(int i = 0; i < m; i++){
        int x = Integer.parseInt(sc.next());
        String s1 = s.substring(0, x);
        String s2 = s.substring(x);
        s = s2 + s1;
      }
      System.out.printf("%s\n", s);
    }
  }
}
