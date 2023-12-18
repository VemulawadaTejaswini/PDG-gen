import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                long a = Long.parseLong(sc.next());
                int v = Integer.parseInt(sc.next());
                a -= Long.parseLong(sc.next());
                a = Math.abs(a);
                v -= Integer.parseInt(sc.next());
                int t = Integer.parseInt(sc.next());
                sc.close();
                if(v < 0) ou.print("NO\n");
                else{
                        if(a * 1.0 / v <= t) ou.print("YES\n");
                        else ou.print("NO\n");
                }
                ou.flush();
        }
}