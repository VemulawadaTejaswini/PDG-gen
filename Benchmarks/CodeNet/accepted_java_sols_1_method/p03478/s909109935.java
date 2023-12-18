import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),a =sc.nextInt(),b=sc.nextInt();
        int ans = 0;
        for(int i = 1;i<=n;i++){
            int j = i, tmp = 0;
            while(j>0){
                tmp += j%10;
                j/=10;
            }
            if(tmp>=a&&tmp<=b){
                ans += i;
            }
        }
        System.out.println(ans);
    }
}