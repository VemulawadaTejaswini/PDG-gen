import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int k = Integer.parseInt(sc.next());
                int q = Integer.parseInt(sc.next());
                int[] s = new int[n];
                int i;
                Arrays.fill(s , k - q);
                for(i = 0 ; i < q ; i++){
                        s[Integer.parseInt(sc.next()) - 1]++;
                }
                for(i = 0 ; i < n ; i++){
                        if(s[i] > 0) ou.print("Yes\n");
                        else ou.print("No\n");
                }
                ou.flush();
        }
}