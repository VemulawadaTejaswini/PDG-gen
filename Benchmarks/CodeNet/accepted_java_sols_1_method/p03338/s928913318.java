import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int max = 0;
    for (int i = 1; i <= s.length(); i++) {
      int count = 0;
      String head = s.substring(0, i);
      String tail = s.substring(i);
       char[] alphabetHead = head.toCharArray();
       char[] alphabetTail = tail.toCharArray();
       Set<Character> hsHead = new HashSet<Character>();
       Set<Character> hsTail = new HashSet<Character>();
       for (int j = 0; j < head.length(); j++) {
         hsHead.add(alphabetHead[j]);
       }
       for (int k = 0; k < tail.length(); k++) {
         hsTail.add(alphabetTail[k]);
       }
       for (char c1 : hsHead) {
         for (char c2 : hsTail) {
           if (c1 == c2) count++;
         }
       }
       max = Math.max(max, count);
       
    }
    System.out.println(max);
  }
}