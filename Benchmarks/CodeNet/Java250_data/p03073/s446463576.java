import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int find(int curr, String s){
        int cans = 0;
        for(int i = 0; i < s.length(); i++){
            int to = s.charAt(i) - '0';
            if(to != curr) cans++;
            curr ^= 1;
        }
        return cans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = Math.min(find(0, s), find(1, s));
        System.out.print(ans);
    }
}
