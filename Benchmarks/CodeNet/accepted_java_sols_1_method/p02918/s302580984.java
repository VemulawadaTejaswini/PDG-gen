/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int k = Integer.parseInt(s[1]);
    char[] seq = br.readLine().toCharArray();
    ArrayList<Integer> vals = new ArrayList<>();
    char c = '?';
    int count = 0;
    for (int i=0; i<n; i++) {
      if (c=='?') {
        c = seq[i];
        count = 1;
        continue;
      } else {
        if (seq[i]==c) {
          count++;
        } else {
          c = seq[i];
          vals.add(count);
          count = 1;
        }
      }
    }
    vals.add(count);
    int sum = vals.get(0);
    int index = 1;
    for (int i=0; i<k && index<vals.size(); i++) {
      sum += vals.get(index);
      if (index+1<vals.size())
        sum += vals.get(index+1);
      index += 2;
    }
    int total = sum - 1;
    for (int i=index; i<vals.size(); i++) {
      total += vals.get(i)-1;
    }
    System.out.println(total);
  }
}
