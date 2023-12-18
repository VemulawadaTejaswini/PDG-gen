import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        long jdk = 1000000000000000000L;
        for(int i = 0;i < n;i++){
            long a = sc.nextLong();
            ans *= a;
        }
        if(ans < 0){
            ans = -1;
        }
        System.out.println(ans);
    }
}
