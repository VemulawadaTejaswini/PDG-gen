import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans;
        if(n<1){
            ans = m*(m-1)/2;
        } else if(m<1){
            ans = n*(n-1)/2;
        } else {
            ans = n*(n-1)/2+m*(m-1)/2;
        }
        System.out.println(ans);
    }
}