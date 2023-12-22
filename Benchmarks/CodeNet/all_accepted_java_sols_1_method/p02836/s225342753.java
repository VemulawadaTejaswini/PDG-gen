import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
/*
      int n = Integer.parseInt(sc.next());

      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
      }
*/
      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];

      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      int lll = (lng-1)/2;

      int cnt = 0;
      for(int i=0;i<=lll;i++){
        //System.out.println("aaa");
        if(c[i]!=c[lng-1-i]){
          cnt++;
        }
      }

      System.out.println(cnt);

    }
}
