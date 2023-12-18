import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      Arrays.sort(arr);
      Deque<Long> deque = new LinkedList<>();
      for(long a : arr)
        deque.addLast(a);

      List<String> res = new ArrayList<>();
      while(deque.size() > 2) {
        long n1 = 0L;
        long n2 = 0L;
        String str = "";
        if(deque.peekFirst() >= 0) {
          n1 = deque.pollFirst();
          n2 = deque.pollFirst();
          deque.offerFirst(n1 - n2);
          str = n1 + " " + n2;
        } else if(deque.peekLast() <= 0) {
          n1 = deque.pollLast();
          n2 = deque.pollLast();
          deque.offerLast(n1 - n2);
          str = n1 + " " + n2;
        } else {
          n1 = deque.pollFirst();
          n2 = deque.pollLast();
          if(deque.peekFirst() < 0) {
            deque.offerLast(n2 - n1);
            str = n2 + " " + n1;
          } else {
            deque.offerFirst(n1 - n2);
            str = n1 + " " + n2;
          }
        }
        res.add(str);
      }
      long n1 = deque.pollFirst();
      long n2 = deque.pollLast();
      System.out.println(n2 - n1);
      res.add(n2 + " " + n1);
      for(String str : res)
        System.out.println(str);
  }
}