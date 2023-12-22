import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int eat = 0;
        
        for (int i = 1; i <= n; i++) {
            eat = l + i - 1;
            //System.out.println(min);
            if (Math.abs(eat) < Math.abs(min)) {
                min = eat;
            }
        }
        
        //System.out.println(min);

        for (int i = 1; i <= n; i++) {
            sum += l + i - 1;
        }

        System.out.println(sum - min);

        sc.close();
    }
}