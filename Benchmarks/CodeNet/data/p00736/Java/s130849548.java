import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      String s = sc.next();
      if(s.equals(".")){
        break;
      }

      int cnt = 0;
      for(int P=0;P<3;P++){
        for(int Q=0;Q<3;Q++){
          for(int R=0;R<3;R++){
            String p = "" + P;
            String q = "" + Q;
            String r = "" + R;
            String ss = s.replaceAll("P",p).replaceAll("Q",q).replaceAll("R",r);

            while(ss.length() != 1){
              ss = ss.replaceAll("\\-0","2");
              ss = ss.replaceAll("\\-1","1");
              ss = ss.replaceAll("\\-2","0");

              ss = ss.replaceAll("(\\(0\\*0\\))|(\\(0\\*1\\))|(\\(0\\*2\\))|(\\(1\\*0\\))|(\\(2\\*0\\))","0");
              ss = ss.replaceAll("(\\(1\\*1\\))|(\\(1\\*2\\))|(\\(2\\*1\\))","1");
              ss = ss.replaceAll("(\\(2\\*2\\))","2");

              ss = ss.replaceAll("(\\(0\\+2\\))|(\\(1\\+2\\))|(\\(2\\+2\\))|(\\(2\\+1\\))|(\\(2\\+0\\))","2");
              ss = ss.replaceAll("(\\(0\\+1\\))|(\\(1\\+1\\))|(\\(1\\+0\\))","1");
              ss = ss.replaceAll("(\\(0\\+0\\))","0");
            }

            if(ss.equals("2")){
              cnt++;
            }
          }
        }
      }

      System.out.println(cnt);
    }
  }
}