import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int leg = s.length();

    int count = 0;
    
    for(int i = 0 ; i < leg/2 ; ++i){
      if(s.charAt(i) != s.charAt(leg-i-1)){
        count++;
      }

    }
    
    System.out.println(count);

  }
}
