import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[10001];
        int min = Math.min(n, 1105);
        for (int x=1; x<=min; x++){
            for(int y=1; y<=min; y++) {
                for(int z=1; z<=min; z++) {
                    int value = x*x + y*y + z*z + x*y + y*z + x*z;
                    if (value<=10000) ans[value]++;
                }
            }
        }
        for(int i=1; i<=n; i++) {
            System.out.print(ans[i]);
            System.out.print("\n");
        }
    }
}