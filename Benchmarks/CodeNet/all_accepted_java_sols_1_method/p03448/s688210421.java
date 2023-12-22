import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int pattern = 0;
        for(int k = 0; k <= a; k++) {
            for(int i = 0; i <= b; i++) {
                for(int j = 0; j <= c; j++) {
                    int sum = 500 * k + 100 * i + 50 * j;
                    if(sum == x) pattern++;
                    if(sum > x)break;
                }
            }
        }
        System.out.println(pattern);
    }
}