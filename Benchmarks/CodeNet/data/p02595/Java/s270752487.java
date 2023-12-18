import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); long d = sc.nextInt();
        long dist = d*d;
        int ans = 0;
        for(int i=0;i<n;i++){
            long a = sc.nextInt(); long b = sc.nextInt();
            if((a*a)+(b*b) <= dist){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
