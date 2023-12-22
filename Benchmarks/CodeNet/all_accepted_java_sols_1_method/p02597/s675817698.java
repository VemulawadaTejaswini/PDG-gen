import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        Deque<Character> deq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deq.addLast(c[i]);
        }
        int ans = 0;
        while(true) {
            if(deq.isEmpty()) {
                System.out.println(ans);
                return;
            } else {
                if(deq.pollFirst() == 'W') {
                    if(deq.isEmpty()) {
                        System.out.println(ans);
                        return;
                    } else {
                        while(true) {
                            if(deq.isEmpty()) {
                                System.out.println(ans);
                                return;
                            } else {
                                if(deq.pollLast() == 'R') {
                                    ans++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}