import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans = 1;
        int tmp = a;

        while(tmp < b){
            tmp += a - 1;
            ans++;
        }
        if(b == 1){
            ans = 0;
        }
        System.out.println(ans);
    }
}