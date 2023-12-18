import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        if(n < 2) ans = 1;
        else if(n < 4) ans = 2;
        else if(n < 8) ans = 4;
        else if(n < 16) ans = 8;
        else if(n < 32) ans = 16;
        else if(n < 64) ans = 32;
        else ans = 64;
        System.out.println(ans);
    }
}
