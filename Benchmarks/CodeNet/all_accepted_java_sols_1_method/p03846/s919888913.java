import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for(int i = 0; i < n/2; i++) ans = ans * 2 % 1_000_000_007;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x]++;
        }
        boolean able = true;
        for(int i = n-1; i > 0; i -= 2){
            if(a[i] != 2){
                able = false;
                break;
            }
        }
        if(n % 2 != 0 && a[0] != 1) able = false;

        if(able) System.out.println(ans);
        else System.out.println(0);
        sc.close();
    }

}
