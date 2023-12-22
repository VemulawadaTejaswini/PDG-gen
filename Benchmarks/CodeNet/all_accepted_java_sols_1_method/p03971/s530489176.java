import java.util.*;
import java.io.*;

class Main{
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    int nai = 0;
    int gai = 0;
    for(int i=0;i<n;i++){
      if(s.charAt(i)=='a'){
        if(nai+gai<a+b){
          out.println("Yes");
          nai++;
        }else{
          out.println("No");
        }
      }else if(s.charAt(i)=='b'){
        if(nai+gai<a+b&&gai<b){
          out.println("Yes");
          gai++;
        }else{
          out.println("No");
        }
      }else{
        out.println("No");
      }
    }
    out.flush();
  }
}