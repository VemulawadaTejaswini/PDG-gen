import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      Queue<String> queue = new LinkedList<>();
      for(long i = 1; i <= 9; i++)
        queue.offer(String.valueOf(i));

      while(k > 1) {
        String num = queue.poll();
        k--;
        int lastDigit = num.charAt(num.length()-1) - '0';
        for(int i = 1; i >= -1; i--) {
          int newDigit = lastDigit - i;
          if(newDigit < 0 || newDigit > 9) continue;
          queue.offer(num + String.valueOf(newDigit));
        }
      }
      System.out.println(queue.peek());
  }
}