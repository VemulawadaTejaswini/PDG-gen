import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int k = Integer.parseInt(sc.next());
                sc.close();
                long yono = 0;
                for(int i = k ; i <= n + 1 ; i++){
                        yono += i * (long)(n - i + 1) + 1;
                        yono %= 1000000007;
                }
                ou.print(yono + "\n");
                ou.flush();
        }
}