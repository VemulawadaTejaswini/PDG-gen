import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String p = sc.nextLine();
    int si;
    for(si = 0;si < s.length();si++){
      if(s.charAt(si) == p.charAt(0)){
        int pi;
        for(pi = 1;pi < p.length();pi++){
          if(s.charAt((si + pi) % s.length()) != p.charAt(pi))break;
        }
        if(pi == p.length()){
          System.out.println("Yes");
          break;
        }
      }
    }
    if(si == s.length())System.out.println("No");
    sc.close();
  }
}

