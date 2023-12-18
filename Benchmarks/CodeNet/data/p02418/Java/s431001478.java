import java.util.*;

public class Ex22{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char cp,sp;
    int bi=0,i,pi,si;
    String s = sc.nextLine();
    String p = sc.nextLine();
    for(pi = 0;pi < p.length();pi++){
      cp = p.charAt(pi);
      for(si = 0;si < s.length();si++){
        i = (bi+si) % s.length();
        sp = s.charAt(i);
        if(cp == sp){
          bi = i;
          break;
        }
      }
      if(si == s.length()){
        System.out.println("No");
        break;
      }
    }
    if(pi == p.length())System.out.println("Yes");
    sc.close();
  }
}

