import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Vector<Long> a = new Vector<>();
        
        int n = sc.nextInt();
        
        int query, p;
        long x;
        for (int i = 0; i < n; i++) {
            query = sc.nextInt();
            
            switch (query) {
                case 0:
                    x = sc.nextLong();
                    a.add(x);
                    break;
                case 1:
                    p = sc.nextInt();
                    System.out.println(a.elementAt(p));
                    break;
                case 2:
                    a.removeElementAt(a.size() - 1);
                    break;
            }
        }
    }
}
