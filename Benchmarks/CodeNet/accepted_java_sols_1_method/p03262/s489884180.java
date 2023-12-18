import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int x = Integer.parseInt(sc.next());
                int[] q = new int[n];
                int yono = 0;
                for(int i = 0 ; i < n ; i++){
                        q[i] = Math.abs(Integer.parseInt(sc.next()) - x);
                        if(q[yono] > q[i]) yono = i;
                }
                sc.close();
                boolean fia = true;
                for(int i = q[yono] ; fia ; i--){
                        boolean ebishu = true;
                        for(int j = 0 ; j < n && ebishu ; j++){
                                if(q[j] % i != 0) ebishu = false;
                        }
                        if(ebishu){
                                fia = false;
                                ou.print(i + "\n");
                        }
                }
                ou.flush();
        }
}