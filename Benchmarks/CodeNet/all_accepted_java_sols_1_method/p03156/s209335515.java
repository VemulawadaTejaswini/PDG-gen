import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if (p <= a)
                cnt1++;
            else if (p <= b)
                cnt2++;
            else
                cnt3++;
        }
        
        System.out.println(Math.min(cnt1, Math.min(cnt2, cnt3)));
    }
}

