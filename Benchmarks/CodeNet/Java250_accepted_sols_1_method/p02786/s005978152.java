import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Long H = sc.nextLong();
        int count = 0;
        Long ans = 0L;
        while (H>0) {
            H = H/2;
            ans += (long) Math.pow(2, count++);
        }
        System.out.println(ans);
    }
}