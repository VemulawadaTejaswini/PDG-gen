import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long count = 1l;
        long ans = -1l;
        if(k % 2 == 0) {
            System.out.println(-1);
            return;
        }
        long tmp = 7;
        while(true) {
            if(tmp % k == 0) {
                String s = Long.toString(tmp);
                ans = s.length();
                break;
            }
            tmp = tmp * 10 + 7;
        }
        System.out.println(ans);
    }
}