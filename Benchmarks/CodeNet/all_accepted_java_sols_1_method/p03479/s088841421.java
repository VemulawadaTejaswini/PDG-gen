import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        int cnt = 0;
        while(x <= y) {
        	cnt++;
        	x = x * 2;
        }
        System.out.println(cnt);
    }

}
