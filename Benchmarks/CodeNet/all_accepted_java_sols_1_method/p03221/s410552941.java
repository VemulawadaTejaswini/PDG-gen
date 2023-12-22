import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] p = new int[m];
    int[] y = new int[m];
    HashMap<Integer, Integer> city = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> junni = new HashMap<Integer, Integer>();
    int[] a = new int[n + 1];
    for(int i = 1; i < n + 1; i++) {
      a[i] = 1;
    }
    int[] ye = new int[m];
    for(int i = 0; i < m; i++) {
      p[i] = sc.nextInt(); 
      y[i] = sc.nextInt();
      ye[i] = y[i];
      city.put(y[i], p[i]);
    }
    Arrays.sort(ye);
    for(int i = 0; i < m; i++) {
      int c = city.get(ye[i]);
      junni.put(ye[i], a[c]);
      a[c]++;
    }
    for(int i = 0; i < m; i++) {
      int jun = junni.get(y[i]);
      String P = String.valueOf(p[i]);
      String Y = String.valueOf(jun);
      String ansp = "";
      String ansy = "";
      for(int j = 0; j < 6 - P.length(); j++) {
        ansp += "0";
      }
      ansp += P;
      for(int j = 0; j < 6 - Y.length(); j++) {
        ansy += "0";
      }
      ansy += Y;
      System.out.println(ansp + ansy);
    }
  }
}