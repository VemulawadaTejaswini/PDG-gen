import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] pizza = new int[5];
        int ans = 1000000000;
        for(int i = 0; i < 5; i++) {
            pizza[i] = scan.nextInt();
        }

        for(int i = 0; i < 2*(pizza[3]+pizza[4])+1; i++) {
            int a = Math.max(0, (pizza[3]-i/2));
            int b = Math.max(0, (pizza[4]-i/2));
            int c = i;
            ans = Math.min(ans,pizza[0]*a + pizza[1]*b + pizza[2]*c);
        }
        System.out.println(ans);
    }
}