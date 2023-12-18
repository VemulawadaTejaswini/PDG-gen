import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = -1;
        for (int i = 1; i < 15000; i++) {
            int x = (int)(i * 0.08);
            int y = (int)(i * 0.10);
            if(x == a && y == b){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
