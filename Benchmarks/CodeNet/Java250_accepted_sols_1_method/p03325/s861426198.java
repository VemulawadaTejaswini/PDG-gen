import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;

        for (int i=0; i<N; /*nop*/) {
            if (a[i] % 2 != 0) {
                i++;
                continue;
            }
            a[i] /= 2;
            ans++;
        }

        System.out.println("" + ans);
    }
}
