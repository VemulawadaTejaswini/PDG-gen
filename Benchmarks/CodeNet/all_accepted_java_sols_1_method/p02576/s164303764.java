import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int x = Integer.parseInt(sc.next());
                int t = Integer.parseInt(sc.next()); 
                int q = (int)Math.ceil(n * 1.0 / x);  
                ou.print(q * t + "\n");     
                ou.flush();
        }
}