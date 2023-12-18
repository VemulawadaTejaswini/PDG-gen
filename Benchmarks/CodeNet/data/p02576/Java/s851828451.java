import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        var X = sc.nextInt();
        int T = sc.nextInt();
        double a = N/X; 
        int ans =(int)Math.ceil(a) * T;
        System.out.println(ans);
    }
}   