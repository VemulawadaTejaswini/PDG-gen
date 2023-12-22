import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String SA = sc.next();
        String[] a = SA.split("");
        String SB = sc.next();
        String[] b = SB.split("");
        String SC = sc.next();
        String[] c = SC.split("");
        
        Deque<String> aque = new ArrayDeque<>();
        for(int i=0; i<a.length; i++) {
            aque.add(a[i]);
        }
        Deque<String> bque = new ArrayDeque<>();
        for(int i=0; i<b.length; i++) {
            bque.add(b[i]);
        }
        Deque<String> cque = new ArrayDeque<>();
        for(int i=0; i<c.length; i++) {
            cque.add(c[i]);
        }
        
        String now = "a";
        while(true) {
            if(now.equals("a")) {
                if(aque.size() == 0) {
                    System.out.println("A");
                    break;
                }
                now = aque.poll();
            }else if(now.equals("b")) {
                if(bque.size() == 0) {
                    System.out.println("B");
                    break;
                }
                now = bque.poll();
                
            }else {
                if(cque.size() == 0) {
                    System.out.println("C");
                    break;
                }
                now = cque.poll();
                
            }
        }
    }
}
