import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        int i =0;
        for(i=x; ; i++) {
            int count = 0;
            int j =1;
            for(; j<=i; j++) {
                if(i % j == 0) count++;
                if(count == 2) break;
            }
            if(j == i) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}