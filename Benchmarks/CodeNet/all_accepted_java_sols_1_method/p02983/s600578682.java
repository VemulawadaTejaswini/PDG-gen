import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int lm = l % 2019;
        int rm = r % 2019;

        if(lm < rm){
            if(l + (2019-lm) <= r){
                System.out.println("0");
            } else {
                int ans = Integer.MAX_VALUE;
                for(int i = lm; i <= rm;i++) {
                    for (int j = i + 1; j <= rm; j++) {
                        ans = Math.min(ans, i * j % 2019);
                    }
                }
                System.out.println(ans);
            }
        } else{
            System.out.println("0");
        }
    }
}

