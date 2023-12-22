import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long now = 100;
        int ans = 0;

        while(x > now){
            now += now/100L;
            ans++;
        }
        System.out.println(ans);
    }
}