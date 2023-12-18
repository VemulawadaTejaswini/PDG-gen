import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
    
        long ans = 0;
        for(int i = 1; i <= n; i++){
            int j = i;
            while(j <= n){
                ans += j;
                j += i;
            }
        }
        System.out.println(ans);
    }
}