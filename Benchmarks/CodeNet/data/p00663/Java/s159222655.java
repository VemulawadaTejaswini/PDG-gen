import java.util.*;

public class Main{
  public static boolean check(String s){
    String[] ss = s.replaceAll("\\(|\\)","").split("&");
    boolean[] flg = new boolean[3];
    char[] ch = new char[3];

    for(int i=0;i<3;i++){
      if(ss[i].charAt(0) == '~'){
        ch[i] = ss[i].charAt(1);
      }
      else{
        flg[i] = true;
        ch[i] = ss[i].charAt(0);
      }
    }

    if(ch[0] != ch[1] && ch[0] != ch[2] && ch[1] != ch[2])
      return true;
    if(ch[0] == ch[1] && ch[1] == ch[2])
      return flg[0] == flg[1] && flg[1] == flg[2];
    if(ch[0] == ch[1])
      return flg[0] == flg[1];
    if(ch[0] == ch[2])
      return flg[0] == flg[2];

    return flg[1] == flg[2];
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      String[] s = sc.next().split("\\|");
      if(s[0].equals("#")) break;

      boolean flg = false;
      for(String ss : s){
        if(check(ss)){
          flg = true;
          break;
        }
      }

      System.out.println(flg ? "yes" : "no");
    }
  }
}