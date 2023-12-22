import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String x = s.substring(0,2);
    String l = s.substring(2,4);
    int y = Integer.parseInt(x);
    int m = Integer.parseInt(l);
    // System.out.println(y + " " + m);
    if(0<y && y<=12 && 0<m && m<=12){
      System.out.println("AMBIGUOUS");
    }else if(0<m && m<=12){
      System.out.println("YYMM");
    }else if(0<y && y<=12){
      System.out.println("MMYY");
    }else{
      System.out.println("NA");
    }
  }
}
