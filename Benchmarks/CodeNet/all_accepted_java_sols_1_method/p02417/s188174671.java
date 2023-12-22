import java.util.*;
import java.io.*;

class Main {
  public static void main(String args[]) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String in = "";
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    try {
      while ((in = br.readLine()) != null) {
        if (in.equals("")) break;
        for(String s : in.split("(?<=.)")) {
          s = s.toLowerCase();
          int count = map.containsKey(s) ? map.get(s) : 0;
          map.put(s, count + 1);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    int ans = 0;
    for(String s : "abcdefghijklmnopqrstuvwxyz".split("(?<=.)")) {
      if (!map.containsKey(s)) {
        ans = 0;
      } else {
        ans = map.get(s);
      }
      System.out.println(s + " : " + ans);
    }
  }
}