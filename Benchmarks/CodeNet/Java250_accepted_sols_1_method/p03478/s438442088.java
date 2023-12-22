import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int n, a, b;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        int ans = 0;
        int tmp;
        int x;
        int t;
        for(int i = 1; i <= n; i++){
            tmp = i;
            x = 0;
            while(tmp != 0){
                x += tmp % 10;
                tmp /= 10;
            }

            if(a <= x && x <= b) ans += i;
        }

        System.out.println(ans);

        sc.close();
    }
}