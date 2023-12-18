import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        long jdk = 1;
        boolean ok = true;
        for(int i = 0;i < 18;i++){
            jdk *= 10;
        }
        for(int i = 0;i < n;i++){
            ans *= sc.nextLong();
            if(ans > jdk || ans < 0){
                ans = 1;
                ok = false;
            }
        }
        System.out.println(ok? ans : -1);
    }
}