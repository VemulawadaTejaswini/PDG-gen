import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                String s = sc.next();
                int yono = 0;
                for(int i = 0 ; i < s.length() ; i++){
                        yono += (int)s.charAt(i) - 48;
                        yono %= 9;
                }
                if(yono == 0) ou.print("Yes\n");
                else ou.print("No\n");
                ou.flush();
        }
}