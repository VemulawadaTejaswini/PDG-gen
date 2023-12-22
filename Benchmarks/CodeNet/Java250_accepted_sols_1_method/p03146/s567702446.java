import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s == 1 || s == 2) {
            System.out.println(4);
            return;
        }
        int ans = 1;
        while(true) {
            if(s == 1) {
                ans++;
                break;
            }
            if(s % 2 == 0) {
                s /= 2;
            } else {
                s = s * 3 + 1;
            }
            ans++;
        }
        System.out.println(ans);
    }
}