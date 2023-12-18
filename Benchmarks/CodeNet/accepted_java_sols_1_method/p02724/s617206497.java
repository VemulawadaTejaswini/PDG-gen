import java.util.*;

/*
問題文


*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

    int ans = 0;
    
    ans += s / 500 * 1000;
    ans += (s % 500)/ 5 * 5;
        System.out.println(ans);
    }
}