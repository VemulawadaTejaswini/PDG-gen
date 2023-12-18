import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = Integer.MAX_VALUE;
        int tmp = 0;
        for(int i = 0; i <= 100000; i++){
            tmp = i * 2*C + Math.max(0, X - i) * A + Math.max(0, Y - i) * B;
            ans = Math.min(tmp, ans);
        }

        System.out.println(ans);
    }
}