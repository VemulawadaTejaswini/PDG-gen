import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Deque<Integer> deq = new ArrayDeque<Integer>();
        
        for (int i = 0; i < s.length; i++) {
            char ch = s[i].charAt(0);
            if (ch == '+' || ch == '-' || ch == '*') {
                int o2 = deq.pop();
                int o1 = deq.pop();
                
                deq.push((ch == '+') ? o1 + o2 : (ch == '-') ? o1 - o2 : o1 * o2);
                
            } else {
                deq.push(Integer.parseInt(s[i]));
            }
        }
        
        System.out.println(deq.pop());
    }
}
