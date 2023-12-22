import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String s_ = sc.next();
    String T_ = sc.next();

    sc.close();

    Set<String> treeSet = new TreeSet<String>();

    String[] s = s_.split("");
    String[] T = T_.split("");
    
    for (int i = 0; i < s.length; i++) {
      if (s[i].equals(T[0]) || s[i].equals("?")) {
        int k = 0;
        for (int j = i; j < s.length; j++) {
          if (s[j].equals(T[k]) || s[j].equals("?")) {
            s[j] = T[k];
            if (k == T.length - 1) {          
              String str_ = "";
              for (int l = 0; l < s.length; l++) {
                if (s[l].equals("?")) {
                  s[l] = "a";
                }
                str_ += s[l];
              }
              treeSet.add(str_);
              s = s_.split("");
              j = s.length;
            } else {
              k++;
            }
          } else {
            s = s_.split("");
            j = s.length;
          }
        }
      }
    }

    if (treeSet.size() == 0) {
      System.out.println("UNRESTORABLE");
    } else {
      for(String value : treeSet) {
        System.out.println(value);
        break;
      }
    }

  }

}