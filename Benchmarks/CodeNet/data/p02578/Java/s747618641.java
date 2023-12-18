import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                long yono = 0;
                long sum = 0;
                int[] a = new int[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = Integer.parseInt(sc.next());
                        if(a[i] < yono) sum += (yono - a[i]);
                        else yono = a[i];
                }
                ou.print(sum + "\n");
                ou.flush();
        }
}