import java.util.*;
import java.io.*;

class Main {
  public static void main(String args[]) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String w = br.readLine();
      String l;
      List<String> t = new ArrayList<String>();
      while (!(l = br.readLine()).equals("END_OF_TEXT")) {
        for (String in : l.split(" ")) {
          t.add(in);
        }  
      }
      int ans = 0;
      for (String str : t) {
        if (str.equalsIgnoreCase(w)) {
          ans++;
        }
      }
      System.out.println(ans);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}