import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int x = Integer.parseInt(sc.next());
                int n = Integer.parseInt(sc.next());
                boolean[] q = new boolean[102];
                Arrays.fill(q , true);
                for(int i = 0 ; i < n ; i++){
                        q[Integer.parseInt(sc.next())] = false;
                }
                int s = 0;
                boolean ebishu = true;
                while(ebishu){
                        if(q[Math.max(0 , x - s)] == true){
                                ou.print(x - s + "\n");
                                ebishu = false;
                        }else if(q[Math.min(101 , x + s)] == true){
                                ou.print(x + s + "\n");
                                ebishu = false;
                        }
                        s++;
                }
                sc.close();
                ou.flush();
        }
}