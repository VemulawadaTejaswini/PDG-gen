
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long a = scn.nextLong(), b = scn.nextLong(), x = scn.nextLong();
        long ans = 0;

        ans = (b / x) - (a / x);

        if(a % x == 0){
            ans++;
        }

        System.out.println(ans);

    }

}