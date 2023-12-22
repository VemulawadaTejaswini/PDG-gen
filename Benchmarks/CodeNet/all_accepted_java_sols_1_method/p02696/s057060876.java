import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int a = Integer.parseInt(sc.next());
                long b = Long.parseLong(sc.next());
                long n = Long.parseLong(sc.next());
                sc.close();
                ou.print((int)(Math.floor(a * Math.min(b - 1 , n) * 1.0 / b) - a * Math.floor(Math.min(b - 1 , n) * 1.0 / b)) + "\n");
                ou.flush();
        }
}