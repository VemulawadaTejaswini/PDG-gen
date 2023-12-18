import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int w = sc.nextInt();

    for(int i = 0 ; i < s.length() ; i++){
      System.out.print(s.charAt(i));
      i += w-1;
    }

  }
}