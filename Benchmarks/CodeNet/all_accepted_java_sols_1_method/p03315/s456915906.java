import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int ans = 0;
        for(int i=0;i<4;i++){
            char cur = S.charAt(i);
            if(cur=='+') ans += 1;
            else ans-= 1;
        }
        System.out.println(ans);
    }
}