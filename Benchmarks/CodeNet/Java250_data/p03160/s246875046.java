import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = scanner.nextInt();
        }
        System.out.println(new Main().f(n, height));
    }

    public int f(int n, int[] height) {
        int pre = 0;
        int cur = 0;
        if(n <= 1)
            return 0;
        pre = 0;
        cur = Math.abs(height[1] - height[0]);
        for(int i = 2; i < n; i++){
            int t = Math.min(cur + Math.abs(height[i] - height[i-1]),
                            pre + Math.abs(height[i] - height[i-2]));
            pre = cur;
            cur = t;
        }
        return cur;
    }
}
