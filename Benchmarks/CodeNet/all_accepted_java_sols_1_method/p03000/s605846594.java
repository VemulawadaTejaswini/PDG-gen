import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int d = 0;
        int cnt = 0;
        if(d <= x) cnt++;
        for (int i = 0; i < n; i++) {
            d += scanner.nextInt();
            if(d <= x){
                cnt++;
            }
//            int l = scanner.nextInt();

        }
        System.out.println(cnt);
    }
}
