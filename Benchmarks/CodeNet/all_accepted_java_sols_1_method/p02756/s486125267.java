import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            deq.offerLast(str.charAt(i) - 'a');
        }
        boolean reverse = false;
        while (q-- > 0) {
            int type1 = sc.nextInt();
            
            if (type1 == 1) {
                reverse = !reverse;
            } else {
                int type2 = sc.nextInt();
                String s = sc.next();
                int t = s.charAt(0) - 'a';
                
                if (type2 == 1) {
                    if (!reverse) {
                        deq.offerFirst(t);
                    } else {
                        deq.offerLast(t);
                    }
                } else {
                    if (reverse) {
                        deq.offerFirst(t);
                    } else {
                        deq.offerLast(t);
                    }
                }
            }
        }
        
        if (!reverse) {
            while (!deq.isEmpty()) {
                char c = (char)(deq.pollFirst() + 'a');
                System.out.print(c);
            }
        } else {
            while (!deq.isEmpty()) {
                char c = (char)(deq.pollLast() + 'a');
                System.out.print(c);
            }
        }
        System.out.println();
    }
}