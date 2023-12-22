import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                sc.close();
                boolean ebishu = true;
                for(long i = 1 ; i <= 3500 && ebishu ; i++){
                        for(long j = 1 ; j <= i && ebishu ; j++){
                                if(1.0 * (n * i * j) / (4 * i * j - n * i - n * j) % 1 == 0 && (n * i * j) / (4 * i * j - n * i - n * j) > 0){
                                        ebishu = false;
                                        ou.print(i + " " + j + " " + (n * i * j) / (4 * i * j - n * i - n * j) + "\n");
                                }
                        }
                }
                ou.flush();
        }
}