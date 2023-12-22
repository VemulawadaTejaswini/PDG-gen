import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ssa = sc.next();
    String ssb = sc.next();
    String ssc = sc.next();
    int la = ssa.length();
    int lb = ssb.length();
    int lc = ssc.length();
    int pa = 0;
    int pb = 0;
    int pc = 0;
    int h = 0;
    String ans = "A";
    for(int i = 0; i < (la + lb + lc); i++) {
      if(h == 0) {
        if(pa < la) {
          if(ssa.charAt(pa) == 'a') {
            h = 0;
          } else if(ssa.charAt(pa) == 'b') {
            h = 1;
          } else {
            h = 2;
          }
          pa++;
        } else {
          break;
        }
      } else if(h == 1) {
        if(pb < lb) {
          if(ssb.charAt(pb) == 'a') {
            h = 0;
          } else if(ssb.charAt(pb) == 'b') {
            h = 1;
          } else {
            h = 2;
          }
          pb++;
        } else {
          ans = "B";
          break;
        }
      } else {
        if(pc < lc) {
          if(ssc.charAt(pc) == 'a') {
            h = 0;
          } else if(ssc.charAt(pc) == 'b') {
            h = 1;
          } else {
            h = 2;
          }
          pc++;
        } else {
          ans = "C";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}