import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int hoge = l + i;
            sum += hoge;
            if(Math.abs(min) > Math.abs(hoge)) {
                min = hoge;
            }
        }
        System.out.println(sum - min);
    }
}