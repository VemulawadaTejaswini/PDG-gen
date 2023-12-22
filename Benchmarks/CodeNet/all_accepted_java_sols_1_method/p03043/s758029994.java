import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        double ans = 0;
        int point;
        int a;
        for(int i = 1; i <= n; i++){
            point = i;
            if(point >= k){
                ans += n-(point-1);
                break;
            }
            a = 0;
            while(true){
                point = point << 1;
                if(point >= k){
                    ans += 1 / Double.valueOf(2 << a);
                    break;
                }
                a++;
            }
        }
        ans /= n;
        
        System.out.println(ans);
    }
}