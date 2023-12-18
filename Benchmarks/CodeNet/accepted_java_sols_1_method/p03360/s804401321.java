import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        int sum = 0;

        for(int i=0; i<=k; i++){
            for(int j=0; j<=k-i; j++){
                sum = (int) ( a * Math.pow(2,i) + b * Math.pow(2,j) + c * Math.pow(2,k-i-j) );
                if(sum > ans) ans = sum;
            }
        }
        System.out.println(ans);
    }
}