import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b= sc.nextInt();
        int ans = 0;
        for(int i = a;i<=b;i++){
            int s= i%10, t = i/10000%10;
            int u = i/10%10,v=i/1000%10;
            if(s==t&&u==v){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}
