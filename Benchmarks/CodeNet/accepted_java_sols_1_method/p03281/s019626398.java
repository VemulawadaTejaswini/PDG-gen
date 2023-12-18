import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=a; i++) {
            int count = 0;
            if(i%2 ==1) {
                for(int j=1; j<=a; j++) {
                    if(i%j == 0) {
                        count++;
                    }
                }
                if(count == 8) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}