import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int appleNum = sc.nextInt();
        int sight = sc.nextInt() * 2 + 1;

        int ans = (int)Math.ceil((double)appleNum / (double)sight);

        System.out.println(ans);
    }
}