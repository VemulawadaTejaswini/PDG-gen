import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String t;
    int count = 0;

    for(int i=0 ; i<=s.length()-3 ; i++){
      t = s.substring(i,i+3);
      if(t.equals("ABC")){
        count++;
      }
    }
    System.out.println(count);
  }
}
