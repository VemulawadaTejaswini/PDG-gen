import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean ym = check(s.substring(0,2),s.substring(2,4));
    boolean my = check(s.substring(2,4),s.substring(0,2));
    if(ym){
      if(my){
        System.out.println("AMBIGUOUS");
      }else{
        System.out.println("YYMM");
      }
    }else{
      if(my){
        System.out.println("MMYY");
      }else{
        System.out.println("NA");
      }
    }
  }
  public static boolean check(String y,String m){
    int yy = Integer.parseInt(y);
    int mm = Integer.parseInt(m);
    int judge = 0;
    if(yy>=0)judge++;
    if(mm>0&&mm<13)judge++;
    boolean ret = false;
    if(judge==2)ret = true;
    return ret;
  }
}
