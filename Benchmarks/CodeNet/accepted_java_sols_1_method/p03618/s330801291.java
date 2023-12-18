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
    
    String s = br.readLine();
    long[] count = new long[26];
    long n = s.length();
    for (int i=0; i<s.length(); i++) {
      count[s.charAt(i)-'a']++;
    }
    long sum = 0;
    for (int i=0; i<26; i++) {
      sum += (count[i]*(count[i]-1))/2;
    }
    System.out.println((n*(n-1))/2 - sum + 1);
  }
}
