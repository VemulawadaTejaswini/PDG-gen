import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    // no self-loop or multiple edges
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        sc.close();
        long n = 1;
        long ans = 0;
        while(H>0){
            ans += n;
            H /= 2;
            n *= 2;
        }
        return ans;
    }
}

