import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      c[0] = s.charAt(0);
      int cnt = 1;
      for(int i=1;i<lng;i++){
        c[i] = s.charAt(i);
        if(c[i-1]!=c[i]){
          cnt++;
        }
      }

      System.out.println(cnt);

    }
}
