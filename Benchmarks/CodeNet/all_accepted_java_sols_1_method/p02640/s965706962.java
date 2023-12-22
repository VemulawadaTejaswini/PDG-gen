import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int a = 0;
        int b = 0;
        String ans = "No";
        for(int i=0; i<=x; i++) {
            a = i;
            b = x-i;
            if(2*a+4*b == y) {
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}