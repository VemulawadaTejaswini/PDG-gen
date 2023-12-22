import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] v = new int[n];
        int[] c = new int[n];
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            v[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < n; i++){
            c[i] = Integer.parseInt(sc.next());
            if(v[i] > c[i]){
                ans += v[i] - c[i];
            }
        }
        
        System.out.println(ans);
    }
}