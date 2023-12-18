import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        long memStrt = Runtime.getRuntime().totalMemory()
            - Runtime.getRuntime().freeMemory();
        
        Main main = new Main();
        main.solv();
        
        long memEnd = Runtime.getRuntime().totalMemory()
            - Runtime.getRuntime().freeMemory();
        long memDif = memEnd - memStrt;
        //System.out.println(memDif); // 3330040
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in, "MS932");
        int n = input.nextInt();
        ArrayDeque<Integer> list = new ArrayDeque<Integer>(2000000);
        while (n-- > 0) {
            String s = input.next();
            if ("insert".equals(s)) {
                int x = input.nextInt();
                list.addFirst(x);
            } else if ("delete".equals(s)) {
                int x = input.nextInt();
                list.remove(x);
            } else if ("deleteFirst".equals(s)) {
                list.pollFirst();
            } else if ("deleteLast".equals(s)) {
                list.pollLast();
            }
        }
        print(list.toArray());
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
}