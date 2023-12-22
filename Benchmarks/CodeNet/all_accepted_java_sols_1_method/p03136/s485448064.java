
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ren = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            ren[i] = sc.nextInt();
            sum+=ren[i];
        }
        int longest = 0;
        for (int i = 0; i < N; i++) {
            if(longest<ren[i])longest=ren[i];
        }
        if(sum-longest>longest)
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}