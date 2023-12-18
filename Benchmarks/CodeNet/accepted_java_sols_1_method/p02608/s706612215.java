import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
    
        var a = new int[60001];
        for(int x = 1; x <= 100; x++){
            for(int y = 1; y <= 100; y++){
                for(int z = 1; z <= 100; z++){
                    int b = x*x + y*y + z*z + x*y + y*z + z*x;
                    a[b]++;
                }
            }
        }
        
        var pw = new PrintWriter(System.out);
        for(int i = 1; i <= n; i++){
            pw.println(a[i]);
        }
        pw.flush();
    }
}