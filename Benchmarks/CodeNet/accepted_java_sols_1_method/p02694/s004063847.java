import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long x = Long.parseLong(sc.next());
        
        long a = 100;
        int ans = 0;
        while(a < x){
            a += a/100;
            ans++;
        }
        System.out.println(ans);
    }
}