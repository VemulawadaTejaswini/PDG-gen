import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt(),z = sc.nextInt();
        int ans1 ,ans2;
        String ans;
        ans1 = x > y ? x - y : y - x;
        ans2 = x > z ? x - z : z - x;
        ans = ans1 < ans2 ? "A" : "B";
        System.out.println(ans);
    }
}
