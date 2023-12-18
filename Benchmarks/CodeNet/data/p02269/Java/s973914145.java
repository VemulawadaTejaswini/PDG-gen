import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main_dictionary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int n = Integer.parseInt(sc.next());
    Set<String> d = new HashSet<String>();
    for (int i=0; i<n; i++) {
      String q = sc.next();
      String s = sc.next();
//      if (q.equals("insert") && !d.contains(s)) 
      if (q.equals("insert")) 
        d.add(s);
      else
        System.out.println(d.contains(s) ? "yes" : "no");
    }
  }
}