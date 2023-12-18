import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = Integer.parseInt(sc.next());
        }
    
        int ans = 0;
        for(int a = 0; a < n; a++){
            for(int b = a+1; b < n; b++){
                if(a == b || l[a] == l[b]) continue;
                for(int c = b+1; c < n; c++){
                    if(a == c || b == c || l[a] == l[c] || l[b] == l[c]) continue;
                    
                    if(l[a] + l[b] > l[c] && l[b] + l[c] > l[a] && l[c] + l[a] > l[b]){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}