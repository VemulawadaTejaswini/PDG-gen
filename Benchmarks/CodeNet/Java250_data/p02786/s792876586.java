import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();

        long ans = 0;
        int tmp = 0;

        while(H != 0){
            H /= 2;
            ans += Math.pow(2,tmp);
            tmp++;
        }

        System.out.println(ans);
    }
}

