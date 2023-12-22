import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int ans = 0;
        
        if(N == 100000) {
            ans = 9 + 900  + 90000;
        }else if(N >= 10000) {
            ans = 9 + 900 + N - 10000 + 1;
        }else if(N >= 1000) {
            ans = 9 + 900;
        }else if(N >= 100) {
            ans = 9 + N - 100 + 1;
        }else if(N >= 10) {
            ans = 9;
        }else {
            ans = N;
        }
        System.out.println(ans);
    }
}