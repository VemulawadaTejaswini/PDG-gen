import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayDeque<Proc> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Proc(sc.next(), sc.nextInt()));
        }
        StringBuilder sb = new StringBuilder();
        int current = 0;
        while (queue.size() > 0) {
            Proc p = queue.poll();
            if (p.time > q) {
                p.time -= q;
                queue.add(p);
                current += q;
            } else {
                current += p.time;
                sb.append(p.name).append(" ").append(current).append("\n");
            }
        }
        System.out.print(sb);
    }
    
    static class Proc {
        String name;
        int time;
        
        public Proc(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }
}
