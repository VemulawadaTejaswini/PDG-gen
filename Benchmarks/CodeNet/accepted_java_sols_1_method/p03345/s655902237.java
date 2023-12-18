import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                long a = Long.parseLong(sc.next());
                long b = Long.parseLong(sc.next());
                long k = Long.parseLong(sc.next());
                k = Long.parseLong(sc.next());
                sc.close();
                if(k % 2 == 0) k = 1;
                else k = -1;
                ou.print((long)((a - b) * k) + "\n");
                ou.flush();
        }
}