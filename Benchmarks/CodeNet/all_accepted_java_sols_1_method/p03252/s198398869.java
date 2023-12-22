import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String t = scan.next();

    String a = "abcdefghijklmnopqrstuvwxyz";

    ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();
    ArrayList<Character> b2 = new ArrayList<Character>();
    ArrayList<Character> c2 = new ArrayList<Character>();


    for (int i=0;i<26;i++){
      ArrayList<Integer> b1 = new ArrayList<Integer>();
      b.add(b1);
      ArrayList<Integer> c1 = new ArrayList<Integer>();
      c.add(c1);
    }

    for (int i=0;i<s.length();i++){
      for (int j=0;j<26;j++){
        if (a.charAt(j) == s.charAt(i)){
          ArrayList<Integer> d = b.get(j);
          d.add(i);
        }

        if (b2.contains(a.charAt(j)) == false){
          b2.add(a.charAt(j));
        }
      }

      for (int j=0;j<26;j++){
        if (a.charAt(j) == t.charAt(i)){
          ArrayList<Integer> e = c.get(j);
          e.add(i);
        }

        if (c2.contains(a.charAt(j)) == false){
          c2.add(a.charAt(j));
        }
      }

    }

    if (b2.size() != c2.size()){
      System.out.println("No");
      return;
    }

    for (int j=0;j<26;j++){
      ArrayList<Integer> m = b.get(j);
      if (m.size() == 0){
        continue;
      }

      char g = t.charAt(m.get(0));
      ArrayList<Integer> what = c.get(g-'a');

      if (what.size() != m.size()){
        System.out.println("No");
        return;
      }
      
      if (m.size() == 1){
        if (what.size() != 1){
          System.out.println("No");
          return;
        }
        continue;
      }
      for (int p : m){
        if (t.charAt(p) != g){
          System.out.println("No");
          return;
        }
      }
    }

    System.out.println("Yes");

  }
}
