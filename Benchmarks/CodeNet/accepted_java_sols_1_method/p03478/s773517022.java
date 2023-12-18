import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        for(int i = 1;i <= num ;i++){
            int sum = 0;
            int n = i;
            while(n != 0){
                sum += n%10;
                n /= 10;
            }
            if(a<=sum && sum<=b)
                ans += i;
        }

        System.out.println(ans);
    }
}