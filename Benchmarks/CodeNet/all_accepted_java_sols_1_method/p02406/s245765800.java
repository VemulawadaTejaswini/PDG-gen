import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.next());
        PrintWriter out = new PrintWriter(System.out);

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0) out.printf(" %d", i);
            else{
                int x = i;
                do{
                    if(x % 10 == 3){
                        out.printf(" %d", i);
                        break;
                    }
                }while((x /= 10) > 0);
            }
        }
        out.println();
        out.flush();
    }
}
