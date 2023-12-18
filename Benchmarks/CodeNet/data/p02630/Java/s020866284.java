import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var count = new long[100001];
        long sum = 0;
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(sc.next());
            count[a]++;
            sum += a;
        }
        
        int q = Integer.parseInt(sc.next());
        var sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            sum -= count[b] * b;
            sum += count[b] * c;
            sb.append(sum).append(System.lineSeparator());
            count[c] += count[b];
            count[b] = 0;
        }
        System.out.print(sb);
    }
}