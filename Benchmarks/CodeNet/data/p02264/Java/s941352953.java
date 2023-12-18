import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        Deque<Proc> st = new ArrayDeque<Proc>(n);
        while (n-- > 0) {
            String name = input.next();
            int time = input.nextInt();
            st.add(new Proc(name, time));
        }
        
        int t = 0;
        while (st.isEmpty() == false) {
            Proc p = st.poll();
            if (p.getTime() <= q) {
                t += p.getTime();
                System.out.println(p.getName() + " " + t);
            } else {
                t += q;
                p.subTime(q);
                st.add(p);
            }
        }
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class Proc {
        String name;
        int time;
        public Proc(String name, int time) {
            this.name = name;
            this.time = time;
        }
        public int getTime() {return time;}
        public int subTime(int t) {time -= t; return time;}
        public String getName() {return name;}
    }
}