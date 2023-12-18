import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());     
        long C = Long.parseLong(sc.next());
        long ans = 0;
        if(A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
            ans = 0;
        }else {
            if(A >= B && A >= C) {
                ans = B * C;
            }else if(B >= A && B >= C) {
                ans = A * C;
            }else {
                ans = A * B;
            }
        }
        System.out.println(ans);
    }
}