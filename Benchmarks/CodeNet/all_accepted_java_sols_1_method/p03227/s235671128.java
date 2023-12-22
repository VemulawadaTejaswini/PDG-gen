import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                String s = sc.next();
                sc.close();
                if(s.length() == 3) ou.print("" + s.charAt(2) + s.charAt(1) + s.charAt(0) + "\n");
                else ou.print(s + "\n");
                ou.flush();
        }
}