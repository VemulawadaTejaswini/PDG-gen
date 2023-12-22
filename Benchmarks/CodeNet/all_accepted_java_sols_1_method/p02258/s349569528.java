import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MIN_VALUE;
        int min = sc.nextInt();
        for(int i = 1; i < n; i++){
            int t = sc.nextInt();
            ans = Math.max(t-min, ans);
            if(t < min) min = t;
        }
        System.out.println(ans);
        sc.close();

    }

}

