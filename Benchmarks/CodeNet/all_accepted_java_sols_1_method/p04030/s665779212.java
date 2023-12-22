import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    String fs;
    String ls = "";
    int lslen = 0;

    for(int i = 0;i < len;i++){
      fs = s.substring(i,(i+1));
      if(fs.equals("0") || fs.equals("1")){
        ls = ls + fs;
      }else if(fs.equals("B")){
        if(!(ls.equals(""))){
          lslen = ls.length();
          lslen -= 1;
          ls = ls.substring(0,lslen);
        }
      }
    }
    System.out.println(ls);
  }
}
