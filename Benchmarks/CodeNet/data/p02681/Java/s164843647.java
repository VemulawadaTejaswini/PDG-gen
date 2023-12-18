import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      String S,T;
      
       while (scan.hasNextLine()) {
      String an = scan.nextLine();
      list.add(an);
      }
      S = list.get(0);
      T = list.get(1);
      check(S,T);
        scan.close();
    }
  
  public static void check(String S , String T){
    int l,s,t;
    int i = 0;
    boolean flag = true;
    s = S.length();
    t = T.length();
    l = t - s;
    char[] tst = new char[t];
    char[] sst = new char[s];
    if(l == 1){
      while(i <= s){
        if(tst[i] != sst[i]){
          flag = false;
        }
        i++;
      }
    }else{
      System.out.println("no");
      return;
    }
    
    if(flag){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
    return;
  }
}