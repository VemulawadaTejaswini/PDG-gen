import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                long n = Long.parseLong(sc.next());
                long p = Long.parseLong(sc.next());
                sc.close();
                if(n == 1){
                        ou.print(p + "\n");
                }else{
                        boolean ebishu = true;
                        for(int i = (int)Math.ceil(Math.pow(p , 1.0 / n)) ; ebishu && i >= 1 ; i--){
                                if(p % (long)Math.pow(i , n) == 0){
                                        ou.print(i + "\n");
                                        ebishu = false;
                                }
                        }
                }
                ou.flush();
        }
}