import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 1;
        for(int i = 1; i < n; i++) {
        	if(s.charAt(i) == s.charAt(i-1)) continue;
        	cnt++;
        }
        System.out.println(cnt);
    }
}
