import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        List<Integer> al = new ArrayList<>();  
        int q = Integer.parseInt(sc.next());
        for (int i = 1; i <= q; i++) {
            int query = Integer.parseInt(sc.next());
            if (query == 0) {
                int x = Integer.parseInt(sc.next());
                al.add(x);
//                pw.println(al);
            } else if (query == 1) {
                int p = Integer.parseInt(sc.next());
                pw.println(al.get(p));
            } else if (query == 2) {
                al.remove(al.size()-1);
//                pw.println(al);
            }
        }
        pw.flush();
    }
}
