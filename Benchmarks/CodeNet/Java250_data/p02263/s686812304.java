import java.util.*;

public class Main {
  public static boolean isNum(String str) {
    try {
      Integer.parseInt(str);
      return true;
    } catch(NumberFormatException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Deque<Integer> deq = new ArrayDeque<>();
    String s = "";
    int a = 0;
    while(sc.hasNext()) {
      s = sc.next();
      if(isNum(s)) {
        deq.addFirst(Integer.parseInt(s));
      } else if(s.equals("+")) {
        a = deq.pollFirst() + deq.pollFirst();
        deq.addFirst(a);
      } else if(s.equals("-")) {
        a = (deq.pollFirst() - deq.pollFirst()) * (-1);
        deq.addFirst(a);
      } else {
        a = deq.pollFirst() * deq.pollFirst();
        deq.addFirst(a);
      }
    }
    sc.close();
    System.out.println(deq.getFirst());
  }
}

