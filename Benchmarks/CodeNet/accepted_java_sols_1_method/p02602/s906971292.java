import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        var a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        var pw = new PrintWriter(System.out);
        for(int i = k; i < n; i++){
            if(a[i] > a[i-k]){
                pw.println("Yes");
            }else{
                pw.println("No");
            }
        }
        pw.flush();
    }
}