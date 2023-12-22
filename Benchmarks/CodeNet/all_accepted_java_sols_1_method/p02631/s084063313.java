import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int xor = 0;
        var a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            xor ^= a[i];
        }
        
        var sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            xor ^= a[i];
            sb.append(xor).append(" ");
            xor ^= a[i];
        }
        System.out.println(sb);
    }
}