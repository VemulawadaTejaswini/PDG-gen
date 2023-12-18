import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int cnt = 0;
    char Sc[] = S.toCharArray();
    char Tc[] = T.toCharArray();
    for(int i = 0, len = S.length(); i < len; i++){
      if(Sc[i] != Tc[i]){
        cnt++;
      }
    }
    PrintWriter out = new PrintWriter(System.out);
    out.print(cnt);
    out.flush();
  }
}